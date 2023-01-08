import java.util.Scanner;


public class Zadanie695 {
	public static void main(String[] args) {
			
			System.out.println("Podaj 8 liczb");
			
			int firstNumber = getInt();
			int secondNumber = getInt();
			int thirdNumber = getInt();
			int fourthNumber = getInt();
			int fifthumber = getInt();
			int sixthNumber = getInt();
			int seventhNumber = getInt();
			int eighthNumber = getInt();
			
			int [] numbers = {firstNumber, secondNumber, thirdNumber, fourthNumber, fifthumber, sixthNumber, seventhNumber, eighthNumber};
			
			for (int i = 1; i < numbers.length; i++) {
				int numberToCompare = numbers[i];
				int j = i - 1;
				
				while (j >= 0 && numbers[j] > numberToCompare) {
					numbers[j + 1] = numbers[j];
					j--;
				}
				numbers[j + 1] = numberToCompare;
				

			}
			for (int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i] + ", ");
			}
	}
	
	
public static int getInt() {
return new Scanner(System.in).nextInt();
}

}