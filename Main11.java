package by.htp.les01.main;

public class Main11 {

	public static void main(String[] args) {

		// 11. Составить программу нахождения разности кубов первых двухсот чисел

		int i = 1;
		long difference = 0;
		while (i <= 200) {
			if (i % 2 == 1) {
				difference = (long) (Math.pow(i, 3) - difference);
			}
			i++;
		}
		System.out.println(" difference = " + difference);
	}
}
