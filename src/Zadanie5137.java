import java.util.Scanner;

  public class Zadanie5137 {
	public static void main(String[] args) {

	System.out.println("Podaj liczbe gwiazdek na choinkę");
	
	int numberStars = getInt();
	int starsCount = 0;
	int linesCount = 0;
	String star = "*";
	
	// dla parzystych
	if (numberStars % 2 == 0) {
		linesCount = numberStars / 2;
		
		// ile linijek
		for (int i = linesCount; i > 0 ; i--) {
		// ile gwiazdek w linijce
			for (int j = 1; j <= numberStars; j++) {
			int starsInLine = i / 2;
			
				for (int k = 1; k <= starsInLine; k++) {
				System.out.print(star);
				}
			}
			System.out.println();
		}
		
	} else {
		// todo check if + or -
		linesCount = (numberStars / 2) + 1;
	}
	
	
	}


  public static int getInt() {
	return new Scanner(System.in).nextInt();
  }
}