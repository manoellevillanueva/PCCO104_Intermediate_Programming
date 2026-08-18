/**
 * Maria Angel Noelle Villanueva BSCS1A
 * March 5, 2024
 */

// Import Package
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

// Main Class
public class VillanuevaAgeVerification {
    public static void main(String[] args) {

        // Welcoming User
        showMessageDialog(null, "~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~ \nMade by Maria Angel Noelle Villanueva BSCS1A \nAge Verification Program - March 5, 2024 \n~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~ \n\nWelcome to the Concert Ticket Program! \nThis program is for the Emo Party Tour!\n\n", "Concert Tickets", JOptionPane.INFORMATION_MESSAGE);

        // User Age
        int age = Integer.parseInt(showInputDialog(null, "But first... \nHow old are you?", "Age Verification", WARNING_MESSAGE));

        // If-Else depending on Age

        // For Adults
        if(age >= 18) {

            // User Name
            String name = showInputDialog(null, "Please enter your name... ", "What is your name?", JOptionPane.QUESTION_MESSAGE);

            // User Ticket
            int option = showConfirmDialog(null, "Would you like to buy a ticket to the Emo Party Tour in Manila?", "Ticket Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            // If-Else depending on Options

            // For Yes
            if(option == YES_OPTION) {
                showMessageDialog(null, "Thank you! \nI hope you enjoy the concert, " + name + "!", "Thank you so much!", JOptionPane.PLAIN_MESSAGE);
            }

            // For No
            else {
                showMessageDialog(null, "I understand! \nI hope you come back soon, " + name + "!", "See you next time!", JOptionPane.PLAIN_MESSAGE);
            }
        }

        // For Minors
        else {
            showMessageDialog(null, "Sorry, you are too young! \nPlease come back next time!", "Please be careful!", JOptionPane.ERROR_MESSAGE);
        }

    }
}