import javax.swing.JOptionPane;

public class VillanuevaMariaAngelNoelleMidtermsProblem5of6 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Please enter any input to check if it is a palindrome or not:", "Palindrome Checker", JOptionPane.QUESTION_MESSAGE);

        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            JOptionPane.showMessageDialog(null, "The input string is a palindrome.", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The input string is not a palindrome.", "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
