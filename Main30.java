package by.htp.les01.main;

import java.util.Scanner;

public class Main30 {

	public static void main(String[] args) {
		// 30. Написать программу, переводящую римские цифры в арабские.
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" Введите цифру от 1 до 9: ");
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print(" Введите цифру от 1 до 9: ");
		}
		int varN = scan.nextInt();
		while (varN <= 0 || varN > 9) {
			System.out.print(" Введите цифру от 1 до 9: ");
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print(" Введите цифру от 1 до 9: ");
			}
			varN = scan.nextInt();
		}
		switch (varN) {
		case (1):
			System.out.println(" Арабская цифра \"1\" равна римской цифре \"I\"");
			break;
		case (2):
			System.out.println(" Арабская цифра \"2\" равна римской цифре \"II\"");
			break;
		case (3):
			System.out.println(" Арабская цифра \"3\" равна римской цифре \"III\"");
			break;
		case (4):
			System.out.println(" Арабская цифра \"4\" равна римской цифре \"IV\"");
			break;
		case (5):
			System.out.println(" Арабская цифра \"5\" равна римской цифре \"V\"");
			break;
		case (6):
			System.out.println(" Арабская цифра \"6\" равна римской цифре \"VI\"");
			break;
		case (7):
			System.out.println(" Арабская цифра \"7\" равна римской цифре \"VII\"");
			break;
		case (8):
			System.out.println(" Арабская цифра \"8\" равна римской цифре \"VIII\"");
			break;
		case (9):
			System.out.println(" Арабская цифра \"9\" равна римской цифре \"IX\"");
			break;
		}
	}
}
