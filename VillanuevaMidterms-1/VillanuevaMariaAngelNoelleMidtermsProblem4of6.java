/**
 * Maria Angel Noelle Villanueva BSCS1A
 * March 19, 2024 - Midterms (Problem 4/6)
 */

import javax.swing.JOptionPane;

public class VillanuevaMariaAngelNoelleMidtermsProblem4of6 {
    public static void main(String[] args) {
        // Prompt user to choose shape
        String[] options = {"Circle", "Rectangle"};
        int choice = JOptionPane.showOptionDialog(null, "What shape would you like to calculate the area for?",
                "Shape Area Calculator", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

        switch (choice) {
            case 0: // Circle
                calculateCircleArea();
                break;
            case 1: // Rectangle
                calculateRectangleArea();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid choice! Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void calculateCircleArea() {
        // Prompt for circle radius
        String radiusInput = JOptionPane.showInputDialog(null, "Enter radius of circle:", "Circle Area Calculator", JOptionPane.QUESTION_MESSAGE);
        double radius;
        try {
            radius = Double.parseDouble(radiusInput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Calculate circle area
        double area = Math.PI * radius * radius;
        JOptionPane.showMessageDialog(null, "Area of circle: " + area, "Circle Area", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void calculateRectangleArea() {
        // Prompt for rectangle dimensions
        String lengthInput = JOptionPane.showInputDialog(null, "Enter length of rectangle:", "Rectangle Area Calculator", JOptionPane.QUESTION_MESSAGE);
        String widthInput = JOptionPane.showInputDialog(null, "Enter width of rectangle:", "Rectangle Area Calculator", JOptionPane.QUESTION_MESSAGE);
        double length, width;
        try {
            length = Double.parseDouble(lengthInput);
            width = Double.parseDouble(widthInput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Calculate rectangle area
        double area = length * width;
        JOptionPane.showMessageDialog(null, "Area of rectangle: " + area, "Rectangle Area", JOptionPane.INFORMATION_MESSAGE);
    }
}
