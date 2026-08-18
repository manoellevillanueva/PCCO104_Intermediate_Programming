import java.util.Scanner;

// Maria Angel Noelle Villanueva - BSCS1A

public class Villanueva_MariaAngelNoelle {

    public static void main(String[] args) {

        System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
        System.out.println("\nMade by Maria Angel Noelle Villanueva - BSCS1A");
        System.out.println("\n~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");

        countVowels();
        checkPass();

        Book.title();
        Book.author();
        // Commenting out Book.add() and Book.remove() as they are currently empty

    }

    public static void countVowels() {
        Scanner input = new Scanner(System.in);

        System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
        System.out.println("\nInput the String: ");
        String vwl = input.nextLine();
        int count = 0;

        for (char c : vwl.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println("Number of Vowels in the String: " + count);
        System.out.println("~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");

        input.close();
    }

    public static void checkPass() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Password: ");
        String pass = input.nextLine();

        if (isValidPass(pass)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password: please try again!");
        }

        // Close the scanner
        input.close();
    }

    public static boolean isValidPass(String pass) {
        if (pass.length() < 10) {
            return false;
        }
        if (!pass.matches("[a-zA-Z0-9]+")) {
            return false;
        }

        int passNum = 0;
        for (char ch : pass.toCharArray()) {
            if (Character.isDigit(ch)) {
                passNum++;
            }
            if (passNum >= 2) {
                return true;
            }
        }

        return false;
    }
}

class Book {
    static Scanner input = new Scanner(System.in);

    static void title() {
        System.out.print("Please enter a Book Title: ");
        String bookTitle = input.nextLine();
        print(bookTitle);
    }

    static void author() {
        System.out.print("Please enter a Book Author: ");
        String bookAuthor = input.nextLine();
        print(bookAuthor);
    }

    static void add() {
        // Add logic for adding a book
    }

    static void remove() {
        // Add logic for removing a book
    }

    static void print(String text) {
        System.out.println("You entered: " + text);
    }
}