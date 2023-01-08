import java.util.Scanner;

public class Zadanie7754 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz a potem znak");
        String userString = getString();
        char userChar = getString().charAt(0);

        System.out.println(returnNumbersOfChars("Ala ma kota", 'a'));
        System.out.println(returnNumbersOfChars(userString, userChar));

    }
    public static int returnNumbersOfChars(String word, char whatChar) {
        System.out.println(String.format("Podane wartosci: %s, %s", word, whatChar));
        int sumCharts = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == whatChar) {
                sumCharts++;
            }
        }
        return sumCharts;
    }

    public static String getString() {
        return new Scanner(System.in).nextLine();
    }
}
