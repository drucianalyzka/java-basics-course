import java.util.Scanner;

public class Zadanie4158 {
	public static void main(String[] args) {
	
		int year;
		System.out.println("Podaj rok a powiem Ci czy jest on przestepny");
		year = getInt();
		
	
		if ((year%4==0 && !(year%100==0)) || year%400==0) {
			System.out.println("Podany rok jest przestepny");
		} else {
			System.out.println("Podany rok NIE jest przestepny");
		}
	
	
	}


	public static int getInt() {
	return new Scanner(System.in).nextInt();
	}
}