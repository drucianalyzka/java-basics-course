import java.util.Scanner;

public class Zadanie4152 {
	public static void main(String[] args) {
	System.out.println("Podaj 3 boki trojkata a powiem Ci czy mozna z nich zbudowac trojkat");
		int a, b, c;
		System.out.println("Podaj a");
		a = getInt();
		System.out.println("Podaj b");
		b = getInt();
		System.out.println("Podaj c");
		c = getInt();
	
		if (!(a>0 && b>0 && c>0)) {
			System.out.println("Boki musza byc dodatnie");
		} else if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Z podanych bokow mozna zbudowac trojkat");
		} else {
			System.out.println("Z podanych bokow nie da sie zbudować trojkata");
		}
	
	
	}


	public static int getInt() {
	return new Scanner(System.in).nextInt();
	}
}