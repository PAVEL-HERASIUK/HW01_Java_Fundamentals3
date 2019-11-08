package by.htp.les01.main;

public class Main29 {

	public static void main(String[] args) {
		// 29. Даны два числа. Определить цифры, входящие в запись как первого так и
		// второго числа.
		int i;
		int n1 = 123456789;
		int n2 = 105060708;
		int ostatok1;
		int ostatok2;
		boolean res1 = false;
		boolean res2 = false;
		System.out.println("Ответы: ");
		for (i = 0; i < 10; i++) {
			int n1Copy = n1;
			while (n1Copy > 0) {
				ostatok1 = n1Copy % 10;
				if (ostatok1 == i) {
					res1 = true;
				}
				n1Copy = n1Copy / 10;
			}
			int n2Copy = n2;
			while (n2Copy > 0) {
				ostatok2 = n2Copy % 10;
				if (ostatok2 == i) {
					res2 = true;
				}
				n2Copy = n2Copy / 10;
			}
			if (res1 == true && res2 == true) {
				System.out.println(" Цифра " + i + " содержится и в числе " + n1 + ", и в числе " + n2);
			}
			res1 = false;
			res2 = false;
		}
	}
}
