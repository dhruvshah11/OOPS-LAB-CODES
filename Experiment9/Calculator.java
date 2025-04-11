package Experiment9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private JTextField display;
    private double result = 0;
    private String lastCommand = "=";
    private boolean start = true;
    private boolean error = false;

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        // Create display field
        display = new JTextField("0");
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        // Add buttons
        String[] buttonLabels = {
            "C", "←", "%", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "±", "0", ".", "="
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
            if (label.matches("[0-9.]")) {
                button.addActionListener(new NumberListener());
                button.setBackground(new Color(240, 240, 240));
            } else if (label.equals("=")) {
                button.addActionListener(new OperatorListener());
                button.setBackground(new Color(63, 81, 181));
                button.setForeground(Color.WHITE);
            } else if (label.equals("C")) {
                button.addActionListener(e -> {
                    display.setText("0");
                    result = 0;
                    start = true;
                    lastCommand = "=";
                    error = false;
                });
                button.setBackground(new Color(244, 67, 54));
                button.setForeground(Color.WHITE);
            } else if (label.equals("←")) {
                button.addActionListener(e -> {
                    if (!start && !error) {
                        String text = display.getText();
                        if (text.length() > 0) {
                            display.setText(text.substring(0, text.length() - 1));
                            if (display.getText().isEmpty()) {
                                display.setText("0");
                                start = true;
                            }
                        }
                    }
                });
                button.setBackground(new Color(255, 152, 0));
                button.setForeground(Color.WHITE);
            } else if (label.equals("±")) {
                button.addActionListener(e -> {
                    if (!error) {
                        double x = Double.parseDouble(display.getText());
                        display.setText("" + (-x));
                    }
                });
                button.setBackground(new Color(156, 39, 176));
                button.setForeground(Color.WHITE);
            } else {
                button.addActionListener(new OperatorListener());
                button.setBackground(new Color(33, 150, 243));
                button.setForeground(Color.WHITE);
            }
        }

        // Layout components
        setLayout(new BorderLayout(5, 5));
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Add padding
        ((JPanel)getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    private class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String digit = event.getActionCommand();
            if (start) {
                display.setText(digit);
                start = false;
            } else {
                display.setText(display.getText() + digit);
            }
        }
    }

    private class OperatorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            
            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                } else {
                    lastCommand = command;
                }
            } else {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }
        }
    }

    public void calculate(double x) {
        try {
            if (lastCommand.equals("+")) result += x;
            else if (lastCommand.equals("-")) result -= x;
            else if (lastCommand.equals("*")) result *= x;
            else if (lastCommand.equals("/")) {
                if (x == 0) throw new ArithmeticException("Cannot divide by zero");
                result /= x;
            }
            else if (lastCommand.equals("%")) {
                if (x == 0) throw new ArithmeticException("Cannot calculate modulo with zero");
                result %= x;
            }
            else if (lastCommand.equals("=")) result = x;
            
            if (Double.isInfinite(result) || Double.isNaN(result)) {
                throw new ArithmeticException("Result is undefined");
            }
            
            display.setText(String.format("%.8g", result));
            error = false;
        } catch (ArithmeticException e) {
            display.setText("Error: " + e.getMessage());
            error = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
}