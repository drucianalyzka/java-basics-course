import java.util.Scanner;

public class Zadanie4157 {
	public static void main(String[] args) {
	
		int age;
		
		System.out.println("Podaj swoj wiek a powiem Ci czy jestes pelnoletni");
		age = getInt();
		
		boolean wynik;
		
		wynik = age >= 18 ? true : false;
		
		System.out.println(wynik);
	
	
	}


	public static int getInt() {
	return new Scanner(System.in).nextInt();
	}
}