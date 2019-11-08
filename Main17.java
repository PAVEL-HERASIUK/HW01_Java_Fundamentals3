package by.htp.les01.main;

public class Main17 {

	public static void main(String[] args) {
		// 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
		int a = 1;
		int n = 20;
		int pr = 1;

		for (int i = 0; i < n; i++) {
			pr = pr * (a + i);
		}
		System.out.println("pr = " + pr);
	}
}
