import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends Frame implements ActionListener {

    private Label title;
    private Label nameLabel;
    private TextField nameTextField;
    private Label passwordLabel;
    private TextField passwordTextField;
    private Label emaiLabel;
    private TextField emailTextField;
    private Button submitButton;
    private Label phLabel;
    private TextField phTextField;

    public RegistrationForm() {
        // Set layout for the frame
        setLayout(null);

        // Create and add components to the frame
        title=new Label("USER REGISTRATION");
        this.add(title);

        nameLabel = new Label("Name:");
        this.add(nameLabel);
        nameLabel.setBounds(200, 200, 200, 50);

        nameTextField = new TextField(20); // 20 columns wide
        this.add(nameTextField);
        nameTextField.setBounds(600, 200, 200, 50);

        passwordLabel = new Label("Password:");
        this.add(passwordLabel);
        passwordLabel.setBounds(200, 300, 200, 50);

        passwordTextField = new TextField(20); // 20 columns wide
        this.add(passwordTextField);
        passwordTextField.setBounds(600, 300, 200, 50);

        emaiLabel = new Label("Email Id:");
        this.add(emaiLabel);
        emaiLabel.setBounds(200, 400, 200, 50);

        emailTextField = new TextField(40); // 40 columns wide
        this.add(emailTextField);
        emailTextField.setBounds(600, 400, 200, 50);

        phLabel = new Label("Phone no:");
        this.add(phLabel);
        phLabel.setBounds(200, 500, 200, 50);

        phTextField = new TextField(40); // 40 columns wide
        this.add(phTextField);
        phTextField.setBounds(600, 500, 200, 50);

        submitButton = new Button("Register");
        this.add(submitButton);
        this.submitButton.setBounds(200, 600, 200, 50);

        // Register ActionListener for the button
        this.submitButton.addActionListener(this);

        // Set properties of the frame
        this.setTitle("Registration Form");
        this.setSize(1024,768);
        this.setVisible(true);
        title.setBounds(350, 80, 600, 70);

        // Add window listener to handle closing of the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the frame
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Retrieve user inputs
            String name = nameTextField.getText();
            String password = passwordTextField.getText();
            String id = emailTextField.getText();
            String phno = phTextField.getText();

            // Display registration confirmation
            System.out.println("Registration Details:");
            System.out.println("Name: " + name);
            System.out.println("Password: " + password);
            System.out.println("Email Id: " + id);
            System.out.println("Phone no: " + phno);
            System.out.println("Registration successful!");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}