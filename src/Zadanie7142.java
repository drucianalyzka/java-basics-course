import java.util.Scanner;


public class Zadanie7142 {
	public static void main(String[] args) {
			System.out.println("Podaj dwie liczby do odejmowania");
			
			int firstNumber = getInt();
			int secondNumber = getInt();
			
			subtract(firstNumber, secondNumber);

	}
	
public static void subtract(int a, int b) {
	System.out.println(a - b);
}
	
	
public static int getInt() {
return new Scanner(System.in).nextInt();
}

}