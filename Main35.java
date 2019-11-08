package by.htp.les01.main;

public class Main35 {

	public static void main(String[] args) {
		// 35. Найдите количество четных цифр данного натурального числа.

		int a = 123456789;
		int aN = a;
		int i = 0;
		while (aN > 0) {
			int ostat = aN % 10;
			if (ostat % 2 == 0) {
				i++;
			}
			aN = aN / 10;
		}
		System.out.println(" Количество четных цифр числа " + a + " равно " + i);
	}
}