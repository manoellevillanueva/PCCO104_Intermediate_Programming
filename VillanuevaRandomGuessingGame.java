/**
 * Maria Angel Noelle Villanueva BSCS1A
 * March 5, 2024 - Random Guessing Game
 */

// Import Packages
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import java.util.Random;

// Main Class
public class VillanuevaRandomGuessingGame {
    public static void main(String[] args) {

        // Welcoming User
        showMessageDialog(null, "~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~ \nMade by Maria Angel Noelle Villanueva BSCS1A \nRandom Guessing Game - March 5, 2024 \n~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~ \n\nWelcome to the Random Guessing Game! \nYou must guess a number from 1 to 10.\n\n", "Random Guessing Game", JOptionPane.INFORMATION_MESSAGE);

        // Randomize Numbers
        Random rand = new Random();

        // Obtain a number from 1 to 10
        int num = rand.nextInt(10) +1;

        int answer;
        boolean guessedCorrectly = false;

       while (!guessedCorrectly) {
            String input = showInputDialog(null, "The computer has chosen a number... \nGuess the number here:", "What is your guess?", QUESTION_MESSAGE);

            if (input == null) {
                showMessageDialog(null, "Thank you for playing! \nWe hope you play again soon!", "Goodbye!", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }

            try {
                answer = Integer.parseInt(input);
                if (answer < 1 || answer > 10) {
                    showMessageDialog(null, "Please enter numbers 1 to 10 only!", "Invalid Input!", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (answer == num) {
                        showMessageDialog(null, "You got it right! \nCongratulations!", "Congratulations!", JOptionPane.PLAIN_MESSAGE);
                        guessedCorrectly = true;
                    } else {
                        showMessageDialog(null, "Sorry, you got it wrong... \nYou can do it!", "Try again!", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Invalid input! \nPlease enter only numbers from 1 to 10! \nThank you!", "Invalid Input!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

