package by.htp.les01.main;

import java.util.Scanner;

public class Main31 {

	public static void main(String[] args) {
		// 31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно.
		// Человек пытается их угадать. Программа должна выводить угаданные и неугаданные числа
		// из тех, что сгенерировала программа, а также ошибочные числа пользователя.
		int i;
		int varN;
		int[] randArr = new int[15];
		for (i = 0; i < 15; i++) {
			randArr[i] = (int) (Math.random() * 150);
		}
		int result = 0;
		while (result != 15) {
			Scanner scan = new Scanner(System.in);
			System.out.print(" Введите число от 1 до 15: ");
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print(" Введите число от 1 до 15: ");
			}
			varN = scan.nextInt();
			while (varN < 1 || varN > 15) {
				System.out.print("Введите число от 1 до 15: ");
				while (!scan.hasNextInt()) {
					scan.next();
					System.out.print(" Введите число от 1 до 15: ");
				}
				varN = scan.nextInt();
			}
			System.out.print(" Вы ввели число " + varN + ". \n");
			for (i = 0; i < 15; i++) {
				if (randArr[i] == varN) {
					System.out.print("Такое число есть в массиве! \n");
					result++;
				}
			}
		}
	}
}
