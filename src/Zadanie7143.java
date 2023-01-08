import java.util.Scanner;


public class Zadanie7143 {
	public static void main(String[] args) {
			System.out.println("Podaj liczbę do dzialania");
			
			int number = getInt();
						
			System.out.println(cubic(number));

	}
	
public static int cubic(int a) {
	return a*a*a;
}
	
	
public static int getInt() {
return new Scanner(System.in).nextInt();
}

}