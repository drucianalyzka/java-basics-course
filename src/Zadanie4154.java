import java.util.Scanner;

public class Zadanie4154 {
	public static void main(String[] args) {
	
		int a, b, c;
		System.out.println("Podaj trzy liczby a powiem Ci ktora jest najwieksza");
		a = getInt();
		b = getInt();
		c = getInt();
		
	
		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println(b);
		} else if (c > a && c > b) {
			System.out.println(c);
		} else {
			System.out.println("liczby sa rowne");
		}
	
	
	}


	public static int getInt() {
	return new Scanner(System.in).nextInt();
	}
}