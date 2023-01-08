import java.util.Scanner;


public class Zadanie696 {
	public static void main(String[] args) {
			
			System.out.println("Podaj 5 liczb");
			
			int firstNumber = getInt();
			int secondNumber = getInt();
			int thirdNumber = getInt();
			int fourthNumber = getInt();
			int fifthumber = getInt();
			
			
			int [] numbers = {firstNumber, secondNumber, thirdNumber, fourthNumber, fifthumber};
			
			for (int i = 0; i < numbers.length; i++) {
			
				if (numbers[i] < 0) {
					System.out.println("Podaj liczbe naturalna zamiast ujemnej");
					numbers[i] = getInt();
				} 
			}
			
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == 0) {
					numbers[i] = 1;
				} else {
					int result = 1;
					
					for (int j = 1; j <= numbers[i]; j++) {
						result *= j;	
					}
					
					numbers[i] = result;
				}
			}
				
	
			
			for (int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i] + ", ");
			}
	}
	
	
public static int getInt() {
return new Scanner(System.in).nextInt();
}

}