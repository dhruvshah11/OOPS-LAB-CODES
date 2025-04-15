package Experiment9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class EmployeeManagement extends JFrame {
    private JTextField idField, nameField, deptField, salaryField;
    private JButton insertButton, viewButton, clearButton;
    private JTable employeeTable;
    private DefaultTableModel tableModel;
    private JLabel currencyLabel;

    // Database connection parameters
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public EmployeeManagement() {
        setTitle("Employee Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Create main panel
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create input panel
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Employee Details"));

        // Add input fields
        inputPanel.add(new JLabel("Employee ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Department:"));
        deptField = new JTextField();
        inputPanel.add(deptField);

        JPanel salaryPanel = new JPanel(new BorderLayout(5, 0));
        inputPanel.add(new JLabel("Salary:"));
        salaryField = new JTextField();
        currencyLabel = new JLabel("₹");
        currencyLabel.setFont(new Font("Arial", Font.BOLD, 14));
        salaryPanel.add(currencyLabel, BorderLayout.WEST);
        salaryPanel.add(salaryField, BorderLayout.CENTER);
        inputPanel.add(salaryPanel);

        // Create button panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        insertButton = new JButton("Insert Record");
        viewButton = new JButton("View Records");
        clearButton = new JButton("Clear");
        buttonPanel.add(insertButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(clearButton);
        inputPanel.add(buttonPanel);

        // Set button colors
        insertButton.setBackground(new Color(63, 81, 181));
        insertButton.setForeground(Color.WHITE);
        viewButton.setBackground(new Color(76, 175, 80));
        viewButton.setForeground(Color.WHITE);
        clearButton.setBackground(new Color(244, 67, 54));
        clearButton.setForeground(Color.WHITE);

        // Create table
        String[] columns = {"ID", "Name", "Department", "Salary"};
        tableModel = new DefaultTableModel(columns, 0);
        employeeTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(employeeTable);

        // Add components to main panel
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Add main panel to frame
        add(mainPanel);

        // Add action listeners
        insertButton.addActionListener(e -> insertRecord());
        viewButton.addActionListener(e -> viewRecords());
        clearButton.addActionListener(e -> clearFields());

        // Add input validation
        salaryField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });

        idField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });

        // Create database table if not exists
        createTable();
    }

    private void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS employees " +
                    "(id INT PRIMARY KEY, " +
                    "name VARCHAR(100), " +
                    "department VARCHAR(100), " +
                    "salary DOUBLE)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error creating table: " + e.getMessage());
        }
    }

    private void insertRecord() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String department = deptField.getText();
            double salary = Double.parseDouble(salaryField.getText());

            String sql = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";

            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setInt(1, id);
                pstmt.setString(2, name);
                pstmt.setString(3, department);
                pstmt.setDouble(4, salary);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record inserted successfully!");
                clearFields();
                viewRecords(); // Refresh table
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error inserting record: " + e.getMessage());
        }
    }

    private void viewRecords() {
        tableModel.setRowCount(0); // Clear existing records

        String sql = "SELECT * FROM employees";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("department"),
                    String.format("₹%.2f", rs.getDouble("salary"))
                };
                tableModel.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error retrieving records: " + e.getMessage());
        }
    }

    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        deptField.setText("");
        salaryField.setText("");
    }

    public static void main(String[] args) {
        // Load JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found.");
            return;
        }

        SwingUtilities.invokeLater(() -> {
            new EmployeeManagement().setVisible(true);
        });
    }
}