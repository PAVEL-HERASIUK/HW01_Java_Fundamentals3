package by.htp.les01.main;

import java.util.Scanner;

public class Main25 {

	public static void main(String[] args) {
		// 25. Требуется определить факториал числа, которое ввел пользователь.
		long factorial = 1;
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.print(" Введите целое неотрицательное число: ");
		long varN = scan.nextLong();
		while (varN <= 0) {
			while (!scan.hasNextLong()) {
			}
		}
		for (i = 1; i <= varN; i++) {
			factorial = factorial * i;
		}
		System.out.println(" Факториал числа " + varN + " равен " + factorial);
	}
}
