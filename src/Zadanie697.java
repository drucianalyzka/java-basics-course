public class Zadanie697 {
	public static void main(String[] args) {
	
		String [] firstTab = {"nudy", "nha", "budy"};
		String [] secondTab = {"nudy", "na", "budy"};
		
		//porównać i odpowiedzieć na pyatnie czy są takie same
		
		if (firstTab.length != secondTab.length) {
			System.out.println("Tablice nie sa takie same");
		} else {
			//boolean areDiffrent = !firstTab.equals(secondTab);
			boolean areDiffrent = false;

			
			for (int i = 0; i < firstTab.length; i++) {
				if (!firstTab[i].equals(secondTab[i])) {
					areDiffrent = true;
					break;
				}
			}
			
			if (areDiffrent) {
				System.out.println("Tablice sa rozne");
			} else {
				System.out.println("Tablice sa takie same");
			}
		}

	
	}
}