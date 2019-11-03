package by.htp.les01.main;

public class Main7 {

	public static void main(String[] args) {
		//7. Вычислить значения функции на отрезке [а,b] c шагом h:
		double a = 0.0;
		double b = 4.0;
		double h = 0.5;
		double x = a;
		double y;
		for (x = 0; x <= b; x += h) {
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.println(h + " | " + y);
		}
	}
}
