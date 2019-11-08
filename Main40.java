package by.htp.les01.main;

public class Main40 {

	public static void main(String[] args) {
		// 40. Получить все числа, не превышающие заданного числа N, которые делятся без
		// остатка на все свои цифры.

		int i;
		int a = 123;
		boolean res = true;
		for (i = 1; i <= a; i++) {
			int iDuplicate = a;
			while (iDuplicate > 0) {
				int ostat = iDuplicate % 10;
				if (ostat != 0) {
					if (i % ostat != 0) {
						res = false;
						break;
					}
				}
				iDuplicate = iDuplicate / 10;
			}
			if (res) {
				System.out.print(i);
				System.out.print("\n");
			}
			res = true;
		}
	}
}
