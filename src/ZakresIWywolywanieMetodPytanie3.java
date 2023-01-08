public class ZakresIWywolywanieMetodPytanie3 {
public static void main(String[] args) {
System.out.print(ktoraNajwieksza(4, 6, 8));
}

public static int ktoraNajwieksza(int a, int b, int c) {
	if (a > b) {
		if (a > c) {
			return a;
		} else {
			return b;
		}
	} else {
		if (c > b) {
			return c;
		} else {
			return b;
		}
	}
}
}