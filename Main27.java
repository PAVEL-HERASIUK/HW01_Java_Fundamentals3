package by.htp.les01.main;

import java.util.Scanner;

public class Main27 {

	public static void main(String[] args) {
		// 27. Для каждого натурального числа в промежутке от m до n вывести все
		// делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

		int n;
		int m;
		int i;
		int j;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Введите промежуток от m  до n ");
		System.out.println(" > ");
		m = scan.nextInt();
		n = scan.nextInt();
		for (i = m; i <= n; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println(j + " является делителем числа " + i);
				}
			}
		}
	}
}
