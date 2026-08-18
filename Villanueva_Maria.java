import java.util.ArrayList;
import java.util.Scanner;

public class Villanueva_Maria {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.println("\nMade by Maria Angel Noelle Villanueva - BSCS1A");
        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");

        countVowels();

        String password = getPassword();
        if (isValidPassword(password)) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }

        ArrayList<String> books = new ArrayList<>();

        Matilda bk1 = new Matilda();
        Coraline bk2 = new Coraline();
        Daphne bk3 = new Daphne();


        books.add(bk1.bookTitle);
        books.add(bk2.bookTitle);
        books.remove(bk3.bookTitle);

        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.println("\nHere are some lovely books I recommend!");
        print(bk1.bookTitle, bk1.author, bk1.isbn, bk1.year);
        print(bk2.bookTitle, bk2.author, bk2.isbn, bk2.year);
        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");

        input.close();
    }

    public static void countVowels() {
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.println("\nLet us print the number of vowels!");
        System.out.print("\nInput the String: ");
        String vwl = input.nextLine();
        int count = 0;
        for (char c : vwl.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("The Number of Vowels in the String is... " + count);
        System.out.println("\n~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
    }

    public static void print(String bookTitle, String author, String isbn, String year) {
        System.out.println("\nThe title is... " + bookTitle);
        System.out.println("The author is... " + author);
        System.out.println("The ISBN is... " + isbn);
        System.out.println("The year of release is... " + year);
    }

    public static String getPassword() {
        System.out.println("~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+~~+");
        System.out.println("\nTime to enter a password!");
        System.out.println("\nRules:");
        System.out.println("1. It must have at least 10 characters.");
        System.out.println("2. It must consist of only letters and digits.");
        System.out.println("3. It must contain at least 2 digits.");
        System.out.print("\nInput the Password: ");
        return input.nextLine();
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 10) {
            return false;
        }

        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }

        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
            if (digitCount >= 2) {
                return true;
            }
        }

        return false;
    }
}

class Matilda {
    String bookTitle = "Matilda";
    String author = "Roald Dahl";
    String isbn = "9780142402535";
    String year = "1988";
}

class Coraline {
    String bookTitle = "Coraline";
    String author = "Neil Gaiman";
    String isbn = "9780061649691";
    String year = "2002";
}

class Daphne {
    String bookTitle = "Daphne";
    String author = "Marissa Moss";
    String isbn = "9781442440142";
    String year = "2012";
}
