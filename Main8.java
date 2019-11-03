package by.htp.les01.main;

public class Main8 {

	public static void main(String[] args) {
		//8. Вычислить значения функции на отрезке [а,b] c шагом h:
		int a = 2;
		int b = 3;
		int c = 4;
		int h = 1;
		int x;
		int y;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		if (a > b) {
			x = b;
			for (x = 0; x <= a; x += h) {
				if (x == 15) {
					y = (x + c) * 2;
				} else {
					y = (x - c) + 6;
				}
				System.out.println(x + " | " + y);
			}
		} else {
			x = a;
			for (; x <= b; x += h) {
				if (x == 15) {
					y = (x + c) * 2;
				} else {
					y = (x - c) + 6;
				}
				System.out.println(x + " | " + y);
			}
		}
	}
}
