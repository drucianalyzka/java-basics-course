import java.util.Scanner;

public class Zadanie4153 {
	public static void main(String[] args) {
	
		int a, b;
		System.out.println("Podaj dwie liczby a powiem Ci ktora jest najwieksza");
		a = getInt();
		b = getInt();
		
	
		if (a > b) {
			System.out.println(a);
		} else if (b > a) {
			System.out.println(b);
		} else {
			System.out.println("liczby są równe");
		}
	
	
	}


	public static int getInt() {
	return new Scanner(System.in).nextInt();
	}
}