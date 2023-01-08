import java.util.Scanner;

  public class Choinka {
	public static void main(String[] args) {

	System.out.println("Podaj liczbe gwiazdek na choinke");
	int linesCount = 0;
	int numberStars = getInt();
	boolean isNumberEven = numberStars % 2 == 0;
	
	if (isNumberEven) {
		linesCount = numberStars / 2;
	} else {
		linesCount = (numberStars / 2) + 1;
	}
	
	//count of line
		for (int i = 1; i <= linesCount; i++) {
			int starsInLine = 0;
			int spacesInLine = 0;
			
			// number of stars in line 
				if (isNumberEven) {
					starsInLine = i * 2;
					spacesInLine = (numberStars - starsInLine)/2;
				} else {
					starsInLine = (i * 2) - 1;
					spacesInLine = (numberStars - starsInLine)/2;
				}

				
				//printing spaces
				for (int j = 0; j < spacesInLine; j++) {
					System.out.print(" ");
				}
				
				//printing stars
				for (int k = 1; k <= starsInLine; k++) {
					System.out.print("*");
				}
				
				System.out.println();
		}
	}
  public static int getInt() {
	return new Scanner(System.in).nextInt();
  }
}