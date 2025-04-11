package Experiment9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class ToDoList extends JFrame {
    private DefaultListModel<String> listModel;
    private JList<String> todoList;
    private JTextField taskField;
    private JButton addButton;
    private JButton removeButton;

    public ToDoList() {
        setTitle("To-Do List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);

        // Create main panel with border layout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Create input panel for task entry
        JPanel inputPanel = new JPanel(new BorderLayout(5, 0));
        taskField = new JTextField();
        addButton = new JButton("Add Task");
        inputPanel.add(taskField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        // Create list model and JList
        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        todoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(todoList);

        // Create remove button
        removeButton = new JButton("Remove Selected Task");
        removeButton.setEnabled(false);

        // Add components to main panel
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(removeButton, BorderLayout.SOUTH);

        // Add main panel to frame
        add(mainPanel);

        // Add action listeners
        addButton.addActionListener(e -> addTask());
        taskField.addActionListener(e -> addTask()); // Allow adding task with Enter key
        removeButton.addActionListener(e -> removeTask());

        // Add list selection listener
        todoList.addListSelectionListener(e -> {
            removeButton.setEnabled(todoList.getSelectedIndex() != -1);
        });
    }

    private void addTask() {
        String task = taskField.getText().trim();
        if (!task.isEmpty()) {
            listModel.addElement(task);
            taskField.setText("");
        }
        taskField.requestFocus();
    }

    private void removeTask() {
        int selectedIndex = todoList.getSelectedIndex();
        if (selectedIndex != -1) {
            listModel.remove(selectedIndex);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ToDoList().setVisible(true);
        });
    }
}