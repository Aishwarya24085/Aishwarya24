import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loginpage extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Loginpage() {
        super("Login Page");

        // Create components
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Set layout for the frame
        setLayout(new GridLayout(3, 1)); // 3 rows, 1 column

        // Create panel to hold login components
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(2, 2)); // 2 rows, 2 columns

        // Add components to the login panel
        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(usernameField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);

        // Add login panel and login button to the frame
        this.add(loginPanel);
        this.add(loginButton);

        // Register action listener for the login button
        loginButton.addActionListener(this);

        // Set frame properties
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the frame on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars);

            // Perform validation
            if (isValidLogin(username, password)) {
                JOptionPane.showMessageDialog(this, "Login successful!");
                // Clear fields after successful login (optional)
                usernameField.setText("");
                passwordField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
            }
        }
    }

    private boolean isValidLogin(String username, String password) {
        
        return username.equals("Aishwarya") && password.equals("password");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Loginpage());
    }
}
