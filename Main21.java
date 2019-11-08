package by.htp.les01.main;

public class Main21 {

	public static void main(String[] args) {
		// 21. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
		//     Результат представить в виде таблицы, первый столбец которой – значения
		//     аргумента, второй - соответствующие значения функции: F(x) = x − sin(x).
		
		double a = -0.2;
		double b = 1;
		double h = 0.2;
		double m;
		for (m = a; m <= b; m = m + h) {
			System.out.println("x = " + m + ", F(" + m + ") = " + (m - Math.sin(m)));
		}
	}
}