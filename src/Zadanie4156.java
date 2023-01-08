import java.util.Scanner;

public class Zadanie4156 {
	public static void main(String[] args) {
	
		String name;
		System.out.println("Podaj swoje imie a powiem Ci czy jest takie jak moje");
		name = getString();
		
	
		if (name.equals("Asia")) {
			System.out.println("Takie same");
		} else {
			System.out.println("Rozne");
		}
	
	
	}

		public static String getString() {
		return new Scanner(System.in).next();
		}
}