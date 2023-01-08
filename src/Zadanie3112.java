import java.util.Scanner;

public class Zadanie3112 {
		public static void main(String[] args) {
		
		System.out.println("Podaj pierwszy wyraz");
		
		String pierwszyWyraz = getString();
		
		System.out.println("Podaj drugi wyraz");
		
		String drugiWyraz = getString();
		
		System.out.println("Podaj trzeci wyraz");
		
		String trzeciWyraz = getString();
		
		String odwrotnaKolejnosc = trzeciWyraz + ", " + drugiWyraz + ", " + pierwszyWyraz;
		
		System.out.println(odwrotnaKolejnosc);
	}
	public static String getString() {
	return new Scanner(System.in).next();
	}
}