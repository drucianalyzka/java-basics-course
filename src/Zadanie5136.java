import java.util.Scanner;

  public class Zadanie5136 {
	public static void main(String[] args) {
		
		int result = 0;
		String isEnd = "n";

		
			
			System.out.println("Podaj dwie liczby do liczenia: ");
		
			int firstNumber = getInt();
			int secondNumber = getInt();
		
			System.out.print("Podaj jakie działanie ma zostać wykonane(* / + -): ");
		
			String operation = getString();
		
			if (secondNumber == 0 && operation.equals("/")) {
				System.out.print("Dzielnik nie moze byc rowny 0, podaj inny dzielnik: ");
				secondNumber = getInt();
			}
		
			if (!(operation.equals("*") || operation.equals("/") || operation.equals("+") || operation.equals("-"))) {
				System.out.print("Podaj właściwe działanie do wykonania:");
				operation = getString();
			}

			if (operation.equals("*")) {
				result = firstNumber * secondNumber;
				System.out.println(firstNumber + "*" + secondNumber + "=" + result);
			} else if (operation.equals("/")) {
				result = firstNumber / secondNumber;
				System.out.println(firstNumber + "/" + secondNumber + "=" + result);
			} else if (operation.equals("+")) {
				result = firstNumber + secondNumber;
				System.out.println(firstNumber + "+" + secondNumber + "=" + result);
			} else if (operation.equals("-")) {
				result = firstNumber - secondNumber;
				System.out.println(firstNumber + "-" + secondNumber + "=" + result);
			}
			
		while (true) {
			secondNumber = result;
			
			System.out.println("Czy chcesz wykonac dalsze operacje? (y/n)");
			
			isEnd = getString();
			
			if (isEnd.equals("n")) {
				break;
			} else {
				System.out.println("Podaj jedna liczbe i dzialanie: ");
				
				int nextNumber = getInt();
				String nextOperation = getString();
				int nextResult = 0;
				
				if (nextNumber == 0 && nextOperation.equals("/")) {
				System.out.print("Dzielnik nie moze byc rowny 0, podaj inny dzielnik: ");
				nextNumber = getInt();
				}
				if (!(nextOperation.equals("*") || nextOperation.equals("/") || nextOperation.equals("+") || nextOperation.equals("-"))) {
				System.out.print("Podaj właściwe działanie do wykonania:");
				nextOperation = getString();
			}

			if (nextOperation.equals("*")) {
				nextResult = secondNumber * nextNumber;
				System.out.println(secondNumber + "*" + nextNumber + "=" + nextResult);
			} else if (nextOperation.equals("/")) {
				nextResult = secondNumber / nextNumber;
				System.out.println(secondNumber + "/" + nextNumber + "=" + nextResult);
			} else if (nextOperation.equals("+")) {
				nextResult = secondNumber + nextNumber;
				System.out.println(secondNumber + "+" + nextNumber + "=" + nextResult);
			} else if (nextOperation.equals("-")) {
				nextResult = secondNumber - nextNumber;
				System.out.println(secondNumber + "-" + nextNumber + "=" + nextResult);
			}
				
				result = nextResult;
			}
				
			

		
		}
}
  public static int getInt() {
	return new Scanner(System.in).nextInt();
  }
  public static String getString() {
	return new Scanner(System.in).next();
	}

}