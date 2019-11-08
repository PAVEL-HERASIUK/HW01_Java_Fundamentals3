package by.htp.les01.main;

public class Main16 {

	public static void main(String[] args) {
		// 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
		int i;
		int sum = 1;
		long sum2 = 1;
		for (i = 1; i <= 10; i++) {
			sum = sum + i;
			sum2 = sum2 * sum;
		}
		System.out.println(sum2);
	}
}