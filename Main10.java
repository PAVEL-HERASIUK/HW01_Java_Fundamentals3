package by.htp.les01.main;

public class Main10 {
	public static void main(String[] args) {
		// 10. Составить программу нахождения произведения квадратов первых двухсот
		// чисел
		double i = 1;
		double pr = 0;
		while (i <= 200) {
			pr = (long) Math.pow(i, 2);
			i++;
		}
		System.out.println(pr);
	}
}