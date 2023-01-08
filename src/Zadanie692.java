public class Zadanie692 {
	public static void main(String[] args) {
		
		int [] tab = {8, 3, 7, 9, 1 };
		int maxNumber = 0;
		
		maxNumber = tab[0];
		
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > maxNumber) {
				maxNumber = tab[i];
			}
		}
			
			System.out.println("Największa liczba to " + maxNumber);
			
	
	
	
	}
}