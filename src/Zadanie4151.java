import java.util.Scanner;

public class Zadanie4151 {
	public static void main(String[] args) {
	System.out.println("Podaj liczbe a powiem Ci czy jest podzielna przez 3");
		int x;
		x = getInt();
	
		if (x%3 == 0) {
			System.out.println(x + " jest podzielne przez 3.");
		} else {
			System.out.println(x + " nie jest podzielne przez 3.");
		}
	
	
	}


	public static int getInt() {
	return new Scanner(System.in).nextInt();
	}
}