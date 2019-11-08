package by.htp.les01.main;

public class Main22 {

	public static void main(String[] args) {
		// 22. Составить программу для вычисления значений функции F(x) на отрезке [а,
		// b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения
		// аргумента, второй - соответствующие значения функции: F(x)= sinквадрат().
		
		double a = -0.2;
		double b = 2;
		double h = 0.3;
		double m;
		for (m = a; m <= b; m = m + h) {
			System.out.println(" x = " + m + ", F(" + m + ") = " + Math.pow(Math.sin(m), 2));
		}
	}
}
