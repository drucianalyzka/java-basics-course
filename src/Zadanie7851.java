public class Zadanie7851 {
    public static void main(String[] args) {
        int[] tablica1 = {2, 4, 6};
        int[] tablica2 = {2, 4, 6};

        String[] tab1 = {"Ala", "ma", "psa", ""};
        String[] tab2 = {"Ala", "ma", "psa"};

       //System.out.println(method(tablica1, tablica2));
       System.out.println(areArraysTheSame(tab1, tab2));

    }
/*
    public static boolean method(int number1, int number2) {
        return number1 == number2;
    }

    public static boolean method(double number1, double number2) {
        return number1 == number2;
    }

    public static boolean method(boolean number1, boolean number2) {
        return number1 == number2;
    }

    public static boolean method(char char1, char char2) {
        return char1 == char2;
    }

    public static boolean method(String text1, String text2) {
        return text1.equals(text2);
    }

    public static boolean method(int[] intArray1, int[] intArray2) {

        boolean arraysTheSame = true;

        if (intArray1.length == intArray2.length) {
            for (int i = 0; i < intArray1.length; i++) {
                if (intArray1[i] != intArray2[i]) {
                    arraysTheSame = false;
                    break;
                }
            }
        }
        return arraysTheSame;
    }
*/
    public static boolean areArraysTheSame(String[] stringArray1, String[] stringArray2) {

        boolean arraysTheSame = false;

        if (stringArray1.length == stringArray2.length) {
            for (int i = 0; i < stringArray1.length; i++) {
                if (stringArray1[i].equals(stringArray2[i])) {
                    arraysTheSame = true;
                    System.out.println(stringArray1[i]);
                    System.out.println(stringArray2[i]);
                } else {
                    arraysTheSame = false;
                }
            }
        }
        return arraysTheSame;
    }

}
