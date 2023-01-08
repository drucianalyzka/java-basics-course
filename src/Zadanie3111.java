import java.util.Scanner;

public class Zadanie3111 {
		public static void main(String[] args) {
		
		System.out.println("Podaj długość pierwszego boku trójkąta");
		
		int a = getInt();
		
		System.out.println("Podaj długość drugiego boku trójkąta");
		
		int b = getInt();
		
		System.out.println("Podaj długość trzeciego boku trójkąta");
		
		int c = getInt();
		
		int obwodTrojkata = a + b + c;
		
		System.out.println("Obwód tego trójkąta wynosi " + obwodTrojkata);
	}
	public static int getInt() {
	return new Scanner(System.in).nextInt();
	}
}