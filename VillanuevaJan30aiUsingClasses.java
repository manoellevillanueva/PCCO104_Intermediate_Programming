import java.util.*;

public class VillanuevaJan30aiUsingClasses {

    public static void main(String[] args) {
        Ai.greeting();
        Ai.mariaStuff();
        Ai.mariaAnime();
        Ai.mariaPokemon();
        Ai.mariaMusic();
        Ai.mariaHobbies();
        Ai.mariaOutro();
    }
}

class Ai {
    static String name = "Maria Angel Noelle Villanueva";
    static int age = 20;
    static String address = "Unit 402, 4th floor, Villaruel Tower, Villaruel Street, Barangay 38 Zone 5, Pasay City";

    static void greeting() {
        System.out.println("This is my introduction.");
    }

    static void mariaStuff() {
        System.out.println("\n~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
        System.out.println("\nHello, may you have a blessed day! It is very nice to meet you! :D");
        System.out.println("\nMy full name is " + name + "");
        System.out.println("I am " + age + " years old");
        System.out.println("I live at " + address);
    }

    static void mariaAnime() {
        List<String> myAnime = Arrays.asList("Death Note", "Naruto", "Rozen Maiden");

        System.out.println("\n~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");

        System.out.println("\nHere are 3 anime series that I have finished watching completely: ");
        for (String villanuevaAnime : myAnime) {
            System.out.println(villanuevaAnime);
        }
    }

    static void mariaMusic() {
        List<String> myMusic = Arrays.asList("Ben&Ben", "the GazettE", "Olivia Rodrigo");

        System.out.println("\n~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");

        System.out.println("\nAnd now, these are 3 of my favorite musicians: ");
        for (String villanuevaMusic : myMusic) {
            System.out.println(villanuevaMusic);
        }
    }

    static void mariaHobbies() {
        List<String> myHobbies = Arrays.asList("praying", "studying", "walking");

        System.out.println("\n~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");

        System.out.println("\nI also have 3 hobbies: ");
        for (String villanuevaHobbies : myHobbies) {
            System.out.println(villanuevaHobbies);
        }
    }

    static void mariaPokemon() {
        List<String> myPokemon = Arrays.asList("Pikachu", "Magikarp", "Zoroark");

        System.out.println("\n~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");

        System.out.println("\nThis is a list of my top 3 Pokemon: ");
        for (String villanuevaPokemon : myPokemon) {
            System.out.println(villanuevaPokemon);
        }
    }

    static void mariaOutro() {
        System.out.println("\n~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~~`+`~");
        System.out.println("\nAnd that is all for today!");
        System.out.println("\nGod bless you always!");
    }
}