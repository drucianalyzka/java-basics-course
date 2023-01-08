import java.util.Scanner;

public class Zadanie694 {
	public static void main(String[] args) {
		
		String [] words;

		System.out.println("Podaj piec slow:");
		String firstWord = getString();
		String secondWord = getString();
		String thirdWord = getString();
		String fourthWord = getString();
		String fifthWord = getString();
		
		words = new String[] {firstWord, secondWord, thirdWord, fourthWord, fifthWord};
		
			
		
		for (int i = words.length -1; i >= 0; i--) {
			String word = words[i];
			
			for (int j = word.length() - 1; j>= 0; j--) {
			System.out.print(word.charAt(j));
		}
		System.out.print(" ");
		}
		
		


}



public static String getString() {
return new Scanner(System.in).next();
}
}