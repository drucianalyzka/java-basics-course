import java.util.Scanner;

  public class Zadanie5132 {
	public static void main(String[] args) {

	System.out.println("Podaj liczbe do policzenia silni");
	
	int silnia = getInt();
	int wynik = 1;
	
	if (silnia == 0) {
		System.out.println("Silnia wynosi 1");
		}
	if (silnia < 0) {
		System.out.println("Podaj liczbe naturalna");
		silnia = getInt();
		}
		
	for (int i = 1; i <= silnia; i++) {
		
		wynik *= i;
		}
		
		System.out.println("Silnia wynosi " + wynik);


}
  public static int getInt() {
	return new Scanner(System.in).nextInt();
  }
}