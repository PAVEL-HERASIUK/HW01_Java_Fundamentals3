package by.htp.les01.main;

public class Main14 {

	public static void main(String[] args) {
		// 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
		int n = 20;
		double summa = 0;
		double i;
		for (i = 1; i <= n; i++) {
			summa = summa + 1 / i;
		}
		System.out.println(summa);
	}
}
