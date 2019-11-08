package by.htp.les01.main;

public class Main23 {

	public static void main(String[] args) {
		// 23. Составить программу для вычисления значений функции F(x) на отрезке [а,
		// b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения
		// аргумента, второй - соответствующие значения функции: F(x) = ctg(x/3) + (1/2) sin(x).
		double a = -0.2;
		double b = 2;
		double h = 0.4;
		double m;
		for (m = a; m <= b; m = m + h) {
			System.out.println(" x = " + m + ", F(" + m + ") = " + (1 / Math.tan(m / 3) + Math.sin(m) / 2));
		}
	}
}
