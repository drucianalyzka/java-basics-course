import java.util.Locale;
import java.util.Scanner;

public class Zadanie7752 {
    public static void main(String[] args) {
        System.out.println("Podaj słowo");
        String userWord = getString();

        if (isPalindrom(userWord.toLowerCase())) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }
    }

    public static boolean isPalindrom(String word) {
        char sign1 = ' ';
        char sign2 = ' ';
        boolean isTrue = true;

        for (int i = 0, j = word.length()-1; i<=j; i++, j--) {
            sign1 = word.charAt(i);
            sign2 = word.charAt(j);

            if (sign1 != sign2) {
                isTrue = false;
                break;
            }
        }

        if (isTrue) {
            return true;
        } else {
            return false;
        }

    }


    public static String getString() {
        return new Scanner(System.in).next();
    }
}
