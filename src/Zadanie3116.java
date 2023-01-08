import java.util.Scanner;

public class Zadanie3116 {
	public static void main(String[] args) {
	
		double pi = 3.14;
		
		System.out.println("Podaj promien kola");
		
		int r = getInt();
		
		int poleKola = (int)(pi*r*r);
		
		System.out.println(poleKola);
	}
	public static int getInt() {
	return new Scanner(System.in).nextInt();
	}
}