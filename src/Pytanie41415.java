import java.util.Scanner;

public class Pytanie41415 {
	public static void main(String[] args) {
	
	int x;
	x = getInt();
	
	if (x > 0) {
	System.out.println("x jest wieksze od zero.");
	int poleKwadratu = x * x;
	
	
	System.out.println("Pole kwadratu wynosi: " + poleKwadratu);
	}
	}
	public static int getInt() {
	return new Scanner(System.in).nextInt();
	}
}