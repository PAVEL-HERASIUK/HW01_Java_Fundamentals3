package by.htp.les01.main;

public class Main12 {

	public static void main(String[] args) {
		// 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n
		// >1 Составьте программу нахождения произведения первых 10 членов этой последовательности.

		long product = 1;
		int a = 1;
		for (int i = 1; i <= 10;) {
			a = 6 + a;
			product = product * a;
			i++;
		}
		System.out.println("product = " + product);
	}
}
