/**
 * Question: User Authentication GUI with Java Swing
 *
 * Create a graphical login form application using Java Swing components.
 * The program should demonstrate GUI development, event handling, and
 * basic user authentication in a secure and user-friendly interface.
 *
 * Requirements:
 * 1. Implement a login form with:
 *    - Username input field
 *    - Password input field (masked)
 *    - Login button
 *    - Status message display
 * 2. Include the following features:
 *    - Input validation
 *    - Password masking
 *    - Visual feedback for login status
 *    - Proper layout and spacing
 * 3. Design considerations:
 *    - Professional appearance
 *    - Intuitive layout
 *    - Responsive interface
 *    - Secure password handling
 *
 * Learning Objectives:
 * - Java Swing GUI development
 * - Event handling in Java
 * - Layout management (GridBagLayout)
 * - User input validation
 * - Basic security practices
 */

package Experiment9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginForm() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Username label and field
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Username:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        usernameField = new JTextField(15);
        add(usernameField, gbc);

        // Password label and field
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        passwordField = new JPasswordField(15);
        add(passwordField, gbc);

        // Login button
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        loginButton = new JButton("Login");
        add(loginButton, gbc);

        // Message label
        gbc.gridy = 3;
        messageLabel = new JLabel(" ");
        messageLabel.setForeground(Color.RED);
        add(messageLabel, gbc);

        // Add action listener to login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("password")) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login successful!");
                } else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Invalid username or password!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}