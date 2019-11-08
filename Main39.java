package by.htp.les01.main;

public class Main39 {

	public static void main(String[] args) {
		// 39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число
		// умножили на 7, то получили исходное число. Найти это число.

		int a;
		int i;
		for (i = 100; i <= 999; i++) {
			a = i % 100;
			if (a * 7 == i) {
				System.out.println(i);
			}
		}
	}
}