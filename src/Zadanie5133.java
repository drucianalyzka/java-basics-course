import java.util.Scanner;

  public class Zadanie5133 {
	public static void main(String[] args) {
		
		System.out.println("Podaj slowo malymi literami:");
		
		String slowo = getString();
		boolean czyPalindrom = true;
		
		char znak1 = ' ';
		char znak2 = ' ';
		
		for (int i = 0, j = slowo.length()-1; i <= j; i++, j--) {
			znak1 = slowo.charAt(i);
			znak2 = slowo.charAt(j);
		
			if (znak1 != znak2){
				czyPalindrom = false;
				break;			
			}
		}
		
		if (czyPalindrom) {
			System.out.println("Słowo jest palindromem");
		} else {
			System.out.println("Słowo nie jest palindromem");
		}
	}	
	public static String getString() {
	return new Scanner(System.in).next();
	}
}