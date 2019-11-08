package by.htp.les01.main;

public class Main34 {

	public static void main(String[] args) {
		// 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
		int i;
		int sum = 0;
		for (i = 1000; i < 10000; i++) {
			int iVar = i;
			while (iVar > 0) {
				sum = sum + iVar % 10;
				iVar = iVar / 10;
			}
			if (sum == 15) {
				System.out.print(i + ", ");
			}
			sum = 0;
		}
		System.out.print("\n");
	}
}
