import tensorflow as tf
from tensorflow.keras import layers, models
import numpy as np
import matplotlib.pyplot as plt
import random
from sklearn.model_selection import train_test_split

# Set random seed for reproducibility
random.seed(42)
np.random.seed(42)
tf.random.set_seed(42)

# Generate synthetic data
def generate_reviews(num_samples=1000):
    positive_reviews = [
        "I loved this movie!", "What a fantastic experience!", "Absolutely brilliant!",
        "The cast was amazing!", "I would watch it again!", "This is a must-see!",
        "Incredible storyline and characters!", "Such a heartwarming film!",
        "Fantastic direction and cinematography!", "I can't recommend it enough!"
    ]
    
    negative_reviews = [
        "It was a bad film.", "I hated this movie.", "Absolutely terrible!",
        "The cast was awful!", "I would never watch it again.", "This is not worth your time!",
        "The storyline was boring.", "Such a disappointing experience.",
        "Poorly directed and acted.", "I wouldn't recommend this to anyone."
    ]
    
    reviews = []
    labels = []

    for _ in range(num_samples // 2):
        reviews.append(random.choice(positive_reviews))
        labels.append(1)  # Positive label
        reviews.append(random.choice(negative_reviews))
        labels.append(0)  # Negative label

    return reviews, labels

# Generate a dataset
num_samples = 2000
x_data, y_data = generate_reviews(num_samples)

# Convert to numpy arrays
x_data = np.array(x_data)
y_data = np.array(y_data)

# Split the dataset into training and test sets
x_train, x_test, y_train, y_test = train_test_split(
    x_data, y_data, test_size=0.2, random_state=42, stratify=y_data
)

# Define parameters for vectorization
vocab_size = 10000  # Adjust based on your needs
max_length = 20  # Maximum length of input sequences

# Create and fit the vectorization layer
vectorize_layer = layers.TextVectorization(max_tokens=vocab_size, output_sequence_length=max_length)
vectorize_layer.adapt(x_train)

# Vectorize the training and test data
x_train = vectorize_layer(x_train)
x_test = vectorize_layer(x_test)

# Build a simple neural network model
model = models.Sequential([
    layers.Embedding(vocab_size, 64, input_length=max_length),
    layers.GlobalAveragePooling1D(),
    layers.Dense(16, activation='relu'),
    layers.Dense(1, activation='sigmoid')
])

# Compile the model
model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])

# Train the model
history = model.fit(
    x_train, y_train, epochs=10, batch_size=32, validation_split=0.2, verbose=1
)

# Plot training & validation accuracy
plt.plot(history.history['accuracy'], label='Train Accuracy')
plt.plot(history.history['val_accuracy'], label='Validation Accuracy')
plt.title('Model Accuracy')
plt.xlabel('Epoch')
plt.ylabel('Accuracy')
plt.legend()
plt.show()

# Plot training & validation loss
plt.plot(history.history['loss'], label='Train Loss')
plt.plot(history.history['val_loss'], label='Validation Loss')
plt.title('Model Loss')
plt.xlabel('Epoch')
plt.ylabel('Loss')
plt.legend()
plt.show()

# Evaluate the model on the test set
test_loss, test_accuracy = model.evaluate(x_test, y_test)
print(f'Test accuracy: {test_accuracy:.4f}')

# Testing the model with synthetic examples
test_samples = tf.constant([
    "I loved this movie!",  # Positive
    "It was a bad film.",   # Negative
    "What a fantastic experience!",  # Positive
    "I didn't enjoy it."    # Negative
])

# Predict sentiment on known samples
test_samples_vectorized = vectorize_layer(test_samples)
predictions = model.predict(test_samples_vectorized)

# Display predictions
for review, prediction in zip(test_samples, predictions):
    sentiment = "Positive" if prediction[0] > 0.5 else "Negative"
    print(f"Review: '{review.numpy().decode('utf-8')}'")
    print(f"Raw Prediction Confidence: {prediction[0]:.4f}")
    print(f"Predicted Sentiment: {sentiment}\n")

