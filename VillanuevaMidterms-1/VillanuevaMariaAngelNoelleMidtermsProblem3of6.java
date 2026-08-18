/**
 * Maria Angel Noelle Villanueva BSCS1A
 * March 19, 2024 - Midterms (Problem 3/6)
 */

import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showMessageDialog;

public class VillanuevaMariaAngelNoelleMidtermsProblem3of6 {
    public static void main(String[] args) {
        showMessageDialog(null, "~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~ \nMade by Maria Angel Noelle Villanueva BSCS1A \nMarch 19, 2024 - Midterms (Problem 3/6) \n~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~", "Log-In", JOptionPane.INFORMATION_MESSAGE);


        String validUsername = "user";
        String validPassword = "password123";


        String username = JOptionPane.showInputDialog(null, "Enter your username:", "Login", JOptionPane.QUESTION_MESSAGE);
        String password = JOptionPane.showInputDialog(null, "Enter your password:", "Login", JOptionPane.QUESTION_MESSAGE);


        if (username.equals(validUsername) && password.equals(validPassword)) {

            JOptionPane.showMessageDialog(null, "Welcome, " + username + "! You have successfully logged in.", "Success", JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "Welcome to the program! \nI'm so happy to be with you today! \nIt means that my program code is a success! \n- Made by Maria Angel Noelle Villanueva, BSCS1A", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);

            username = JOptionPane.showInputDialog(null, "Enter your username:", "Login", JOptionPane.QUESTION_MESSAGE);
            password = JOptionPane.showInputDialog(null, "Enter your password:", "Login", JOptionPane.QUESTION_MESSAGE);

            if (username.equals(validUsername) && password.equals(validPassword)) {
                JOptionPane.showMessageDialog(null, "Welcome, " + username + "! You have successfully logged in.", "Success", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Welcome to the program! \nI'm so happy to be with you today! \nIt means that my program code is a success! \n- Made by Maria Angel Noelle Villanueva, BSCS1A", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password. Program will now exit.", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
