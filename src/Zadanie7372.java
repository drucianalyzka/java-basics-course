import java.util.Scanner;


public class Zadanie7372 {
	public static void main(String[] args) {
			System.out.println("Podaj liczbę gwiazdek");
			
			int numberStars = getInt();
			
			printStars(numberStars);
						
			

	}
	
public static void printStars(int a) {
	for (int i=0; i<a; i++) {
		System.out.print("*");
	}
}
	
	
public static int getInt() {
return new Scanner(System.in).nextInt();
}

}