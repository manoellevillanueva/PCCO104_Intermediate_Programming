/**
 * Maria Angel Noelle Villanueva - BSCS1A
 * February 20, 2024
 */

// Imports

import java.util.*;
import javax.swing.*;

// Main Class
public class VillanuevaJavaSetUI {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // My Name
        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.println("\nMade by Maria Angel Noelle Villanueva - BSCS1A");
        System.out.println("On the 20th of February 2024 - Java Set UI");
        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");

        // Frame Title
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.print("\nPlease enter your FRAME TITLE... ");
        String title = input.nextLine();
        JFrame frame = new JFrame(title);
        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");

        // Input Height
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.print("\nPlease enter your window HEIGHT (in pixels)... ");
        int height = input.nextInt();
        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");

        // Input Width
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.print("\nPlease enter your window WIDTH (in pixels)... ");
        int width = input.nextInt();
        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");

        // Setting the Height, Width, and Panel
        input.nextLine();
        frame.setSize(height, width);
        JPanel panel = new JPanel();

        // Input Label Number
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.print("\nPlease enter how many LABELS to add... ");
        int lblNum = input.nextInt();
        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        input.nextLine();

        // Loop, Label Name
        for (int i = 0; i < lblNum; i++) {
            System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
            System.out.print("\nLabel (Name) " + (i + 1) + " of " + (lblNum));
            System.out.print("\nPlease enter your LABEL'S NAME... ");
            String lblName = input.nextLine();
            System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");

            // Setting the Labels
            JLabel lbl = new JLabel(lblName);
            panel.add(lbl);
        }

        // Input Text Field Number
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.print("\nPlease enter how many TEXT FIELDS to add... ");
        int txtFdNum = input.nextInt();
        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        input.nextLine();

        // Loop, Text Field Name and Size
        for (int i = 0; i < txtFdNum; i++) {

            // Input Text Field Name
            System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
            System.out.print("\nText Field (Name) " + (i + 1) + " of " + (txtFdNum));
            System.out.print("\nPlease enter your TEXT FIELD'S NAME... ");
            String txtFdName = input.nextLine();
            System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");

            // Input Text Field Size
            System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
            System.out.print("\nText Field (Size) " + (i + 1) + " of " + (txtFdNum));
            System.out.print("\nPlease enter your TEXT FIELD'S SIZE in columns... ");
            int txtFdSize = input.nextInt();
            System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
            input.nextLine();

            // Setting Text Field Attributes
            JTextField txtFd = new JTextField(txtFdSize);
            panel.add(new JLabel(txtFdName));
            panel.add(txtFd);
        }

        // Input Button Number
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.print("\nPlease enter how many BUTTONS to add... ");
        int bttnNum = input.nextInt();
        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        input.nextLine();

        // Loop, Button Name
        for (int i = 0; i < bttnNum; i++) {
            System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
            System.out.print("\nButton (Name) " + (i + 1) + " of " + (bttnNum));
            System.out.print("\nPlease enter your BUTTON'S NAME... ");
            String bttnName = input.nextLine();
            System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");

            // Setting Button Names
            JButton bttn = new JButton(bttnName);
            panel.add(bttn);
        }

        // Final Design
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.print("\nDone! Your new mini-application shall appear in a new window!");
        System.out.print("\nDeo Gratias!");
        System.out.println("\n\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");

        // Setting Panel
        frame.add(panel);
        frame.setVisible(true);
    }
}