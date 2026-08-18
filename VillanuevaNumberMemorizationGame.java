/**
 * Maria Angel Noelle Villanueva - BSCS1A
 * March 12, 2024 - Number Memorization Game
 */

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import java.util.Random;

public class VillanuevaNumberMemorizationGame {
    public static void main(String[] args) {

        showMessageDialog(null, "~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~ \nMade by Maria Angel Noelle Villanueva BSCS1A \nNumber Memorization Game - March 12, 2024 \n~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~ \n\nWelcome to the Number Memorization Game! \nYou must memorize the numbers and type them correctly, to win the game.\n\n", "Number Memorization Game", JOptionPane.INFORMATION_MESSAGE);

        Random rand = new Random();

        int num1 = rand.nextInt(9000) + 1000;
        int num2 = rand.nextInt(900) + 100;
        int num3 = rand.nextInt(900) + 100;
        int num4 = rand.nextInt(9000) + 1000;

        String numbers = num1 + " " + num2 + " " + num3 + " " + num4;

        int answer;
        boolean guessedFirstCorrectly = false;
        boolean guessedSecondCorrectly = false;
        boolean guessedThirdCorrectly;
        boolean guessedFourthCorrectly;

        String newNums = num1 + " " + num2 + " " + num3 + " " + num4;
        showMessageDialog(null, "The computer has chosen 4 different numbers to memorize... \n" + newNums, "Numbers to Memorize", INFORMATION_MESSAGE);

        while (!guessedFirstCorrectly) {
            String input = showInputDialog(null, "Guess the first number here:", "What is your guess?", QUESTION_MESSAGE);

            if (input == null) {
                showMessageDialog(null, "Thank you for playing! \nWe hope you play again soon!", "Goodbye!", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }

            try {
                answer = Integer.parseInt(input);
                if (answer != num1) {
                    showMessageDialog(null, "Sorry, you got it wrong... \nYou can do it!", "Try again!", JOptionPane.WARNING_MESSAGE);
                } else {
                    showMessageDialog(null, "You got the first number right! \nNow, guess the second number.", "Congratulations!", JOptionPane.PLAIN_MESSAGE);
                    guessedFirstCorrectly = true;
                }
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Invalid input! \nPlease enter only the numbers you from your memory! \nThank you!", "Invalid Input!", JOptionPane.WARNING_MESSAGE);
            }
        }

        while (!guessedSecondCorrectly) {
            String input = showInputDialog(null, "Guess the second number:", "What is your guess?", QUESTION_MESSAGE);

            if (input == null) {
                showMessageDialog(null, "Thank you for playing! \nWe hope you play again soon!", "Goodbye!", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }

            try {
                answer = Integer.parseInt(input);
                if (answer != num2) {
                    showMessageDialog(null, "Sorry, you got it wrong... \nYou can do it!", "Try again!", JOptionPane.WARNING_MESSAGE);
                } else {
                    showMessageDialog(null, "You got the second number right! \nCongratulations!", "Congratulations!", JOptionPane.PLAIN_MESSAGE);
                    guessedSecondCorrectly = true;
                }
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Invalid input! \nPlease enter only the numbers you from your memory! \nThank you!", "Invalid Input!", JOptionPane.WARNING_MESSAGE);
            }
        }

        // Prompt user to continue playing after the second guess
        int continueOption = showConfirmDialog(null, "Do you want to continue playing?", "Continue?", YES_NO_OPTION, QUESTION_MESSAGE);
        if (continueOption == YES_OPTION) {
            // Reset guessed flags
            guessedFirstCorrectly = false;
            guessedSecondCorrectly = false;
        } else {
            showMessageDialog(null, "Thank you for playing! \nWe hope you play again soon!", "Goodbye!", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

        guessedThirdCorrectly = false;

        while (!guessedThirdCorrectly) {
            String input = showInputDialog(null, "Guess the third number:", "What is your guess?", QUESTION_MESSAGE);

            if (input == null) {
                showMessageDialog(null, "Thank you for playing! \nWe hope you play again soon!", "Goodbye!", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }

            try {
                answer = Integer.parseInt(input);
                if (answer != num3) {
                    showMessageDialog(null, "Sorry, you got it wrong... \nYou can do it!", "Try again!", JOptionPane.WARNING_MESSAGE);
                } else {
                    showMessageDialog(null, "You got the third number right! \nCongratulations!", "Congratulations!", JOptionPane.PLAIN_MESSAGE);
                    guessedThirdCorrectly = true;
                }
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Invalid input! \nPlease enter only the numbers from your memory! \nThank you!", "Invalid Input!", JOptionPane.WARNING_MESSAGE);
            }
        }

        guessedFourthCorrectly = false;

        while (!guessedFourthCorrectly) {
            String input = showInputDialog(null, "Guess the fourth number:", "What is your guess?", QUESTION_MESSAGE);

            if (input == null) {
                showMessageDialog(null, "Thank you for playing! \nWe hope you play again soon!", "Goodbye!", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }

            try {
                answer = Integer.parseInt(input);
                if (answer != num4) {
                    showMessageDialog(null, "Sorry, you got it wrong... \nYou can do it!", "Try again!", JOptionPane.WARNING_MESSAGE);
                } else {
                    showMessageDialog(null, "Congratulations! You got all numbers right!", "Congratulations!", JOptionPane.PLAIN_MESSAGE);
                    guessedFourthCorrectly = true;
                }
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Invalid input! \nPlease enter only the numbers you from your memory! \nThank you!", "Invalid Input!", JOptionPane.WARNING_MESSAGE);
            }
        }

        showMessageDialog(null, "Thank you for playing! \nWe hope you play again soon!", "Goodbye!", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}

/**
 * Maria Angel Noelle Villanueva - BSCS1A
 * March 12, 2024 - Number Memorization Game
 */