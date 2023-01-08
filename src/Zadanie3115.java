import java.util.Scanner;

public class Zadanie3115 {
	public static void main(String[] args) {
		
		System.out.println("Podaj wyraz");
		
		String wyraz = getString();
		
		System.out.println();
		
		String duzeLiteryWyraz = wyraz.toUpperCase();
		
		System.out.println(duzeLiteryWyraz);
		
		
	}
	public static String getString() {
	return new Scanner(System.in).next();
	}
}