public class OperatoryInkrementacji {
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		// int a = x++;
		int a = x; // a = 5
		x = x + 1; // x = 6
		
		// int a = ++x;
		//int a = x + 1;
		x = x + 1;

		int b = ++y;
		
		System.out.println(x); // 6
		System.out.println(a); // 5
		System.out.println(y); // 6
		System.out.println(b); // 6
	}
}