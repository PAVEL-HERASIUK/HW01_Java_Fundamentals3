package by.htp.les01.main;

public class Main15 {

	public static void main(String[] args) {
		// 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.
		int i = 0;
		double summa = 0;
		for (i = 0; i <= 10; i++) {
			summa = summa + Math.pow(2, i);
		}
		System.out.println(summa);
	}
}
