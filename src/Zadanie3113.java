import java.util.Scanner;

public class Zadanie3113 {
		public static void main(String[] args) {
		
		System.out.println("Podaj wyraz");
		
		String pierwszyWyraz = getString();
		
		int ileMaLiter = pierwszyWyraz.length();
		
		System.out.println("Ten wyraz ma " + ileMaLiter + " liter");
		
		
	}
	public static String getString() {
	return new Scanner(System.in).next();
	}
}