package ScientificCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class ScientificCalculator extends JFrame implements ActionListener {
    // Components
    private JTextField textField;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    // Constructor
    public ScientificCalculator() {
        setTitle("Scientific Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display box
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        // Buttons
        String[] buttonLabels = {
            "7", "8", "9", "/", "sin",
            "4", "5", "6", "*", "cos",
            "1", "2", "3", "-", "tan",
            "0", ".", "=", "+", "sqrt",
            "log", "exp", "C"
        };

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5, 5, 5));

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    // Helper method to safely parse numbers
    private double getValue() {
        String text = textField.getText();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a number first!");
            return 0;
        }
        try {
            return Double.parseDouble(text);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number!");
            return 0;
        }
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            switch (command) {
                // Numbers and decimal point
                case "0": case "1": case "2": case "3": case "4":
                case "5": case "6": case "7": case "8": case "9": case ".":
                    textField.setText(textField.getText() + command);
                    break;

                // Clear
                case "C":
                    textField.setText("");
                    num1 = num2 = result = 0;
                    break;

                // Basic operators
                case "+": case "-": case "*": case "/":
                    num1 = getValue();
                    operator = command.charAt(0);
                    textField.setText("");
                    break;

                // Equals
                case "=":
                    num2 = getValue();
                    switch (operator) {
                        case '+': result = num1 + num2; break;
                        case '-': result = num1 - num2; break;
                        case '*': result = num1 * num2; break;
                        case '/': 
                            if (num2 == 0) {
                                JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                                return;
                            }
                            result = num1 / num2; 
                            break;
                    }
                    textField.setText(String.valueOf(result));
                    break;

                // Scientific functions
                case "sin":
                    textField.setText(String.valueOf(Math.sin(Math.toRadians(getValue()))));
                    break;
                case "cos":
                    textField.setText(String.valueOf(Math.cos(Math.toRadians(getValue()))));
                    break;
                case "tan":
                    textField.setText(String.valueOf(Math.tan(Math.toRadians(getValue()))));
                    break;
                case "sqrt":
                    textField.setText(String.valueOf(Math.sqrt(getValue())));
                    break;
                case "log":
                    double val = getValue();
                    if (val <= 0) {
                        JOptionPane.showMessageDialog(this, "Log undefined for non-positive numbers!");
                        return;
                    }
                    textField.setText(String.valueOf(Math.log10(val)));
                    break;
                case "exp":
                    textField.setText(String.valueOf(Math.exp(getValue())));
                    break;

                default:
                    JOptionPane.showMessageDialog(this, "Unknown operation!");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScientificCalculator());
    }
}
