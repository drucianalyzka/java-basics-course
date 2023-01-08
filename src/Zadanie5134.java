import java.util.Scanner;

public class Zadanie5134 {
  public static void main(String[] args) {
	  
		int maxNumber = 0;
		int index = 0;
		
		
		while (true) {
			System.out.print("Podaj liczbe: ");
			int userNumber = getInt();
			
			if (index == 0) {
				maxNumber = userNumber;
				index++;
			} else if (userNumber > maxNumber) {
				maxNumber = userNumber;
			}
			
			System.out.print("Czy chcesz podac nastepna liczbe?(y/n): ");
			String isEnd = getString();
			
			if (isEnd.equals("n")) {
				break;
			}
		}
		
		System.out.println(String.format("Najwieksza liczba z podanych to: %d", maxNumber));
			
		
		
  }
  
	public static int getInt() {
	return new Scanner(System.in).nextInt();
	}
	
	public static String getString() {
	return new Scanner(System.in).next();
	}
}