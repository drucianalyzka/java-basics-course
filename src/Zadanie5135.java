public class Zadanie5135 {
  public static void main(String[] args) {

	mainLoop: for (int i = 1; i <= 10; i++) {
		
		if (i % 2 != 0) {
			continue;
			}
			
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
			
			if (j > i) {
				continue mainLoop;
			}
		}
	

	
	}
		
  }
}