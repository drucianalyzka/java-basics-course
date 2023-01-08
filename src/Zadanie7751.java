import java.util.Scanner;

public class Zadanie7751 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz:");
        String word = getString();
        getLastLetter(word);

    }

    public static void getLastLetter(String word) {
        System.out.println(word.charAt(word.length()-1));
    }

    public static String getString() {
        return new Scanner(System.in).next();
    }
}
