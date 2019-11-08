package by.htp.les01.main;

public class Main13 {

	public static void main(String[] args) {
		// 13. Составить таблицу значений функции y = 5 - x 2/2 на отрезке [-5; 5] с
		// шагом 0.5
		int a = -5;
		int b = 5;
		double h = 0.5;
		double m = a;
		System.out.print("Значения функции: ");
		for (m = a; m < b; m = m + h) {
			System.out.print(m + ", ");
		}
		System.out.print(m + "\n");
	}
}