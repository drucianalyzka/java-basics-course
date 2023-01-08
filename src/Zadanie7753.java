import java.util.Scanner;

public class Zadanie7753 {
    public static void main(String[] args) {
        int[] userArray = { 1, 2, 8 };

        System.out.println(sumElementsOfArray(userArray));


    }
    public static int sumElementsOfArray(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return  sum;
    }
}
