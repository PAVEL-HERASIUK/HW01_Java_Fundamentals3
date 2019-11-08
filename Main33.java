package by.htp.les01.main;

public class Main33 {

	public static void main(String[] args) {
		// 33. Найдите наибольшую цифру данного натурального числа.
		int a = 123456789;
		int aN = a;
		int ostatok;
		int max = 0;
		while (aN % 10 > 0) {
			ostatok = aN % 10;
			if (max < ostatok) {
				max = ostatok;
			}
			aN = aN / 10;
		}
		System.out.println(" Наибольшая цифра числа " + a + " равна " + max);
	}
}