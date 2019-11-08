package by.htp.les01.main;

import java.util.Scanner;

public class Main28 {

	public static void main(String[] args) {
		// 282. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить результат Z в зависимости от знака.
		// Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y=0 при делении. Организовать
		// возможность многократных вычислений без перезагрузки программа (т.е. построить цикл). В качестве
		// символа прекращения вычислений принять ‘0’.

		int varN1 = 1;
		while (varN1 != 0) {
			Scanner scan = new Scanner(System.in);
			System.out.print(" Введите первое целое число: ");
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print(" Введите первое целое число: ");
			}
			varN1 = scan.nextInt();
			if (varN1 == 0) {
				System.out.println(" Конец работы программы!");
				break;
			}
			Scanner scan2 = new Scanner(System.in);
			System.out.print(" Введите второе целое число: ");
			while (!scan2.hasNextInt()) {
				scan2.next();
				System.out.print(" Введите второе целое число: ");
			}
			int varN2 = scan2.nextInt();
			Scanner scan3 = new Scanner(System.in);
			System.out.print(" Введите действие (+, –, /, *): ");
			while (!scan3.hasNext("[+-/*]")) {
				System.out.print(" Введите действие (+, –, /, *): ");
				scan3.next();
			}
			String action = scan3.next();

			if (action.equals("+")) {
				System.out.println(varN1 + action + varN2 + " = " + (varN1 + varN2));
			} else if (action.equals("-")) {
				System.out.println(varN1 + action + varN2 + " = " + (varN1 - varN2));
			} else if (action.equals("*")) {
				System.out.println(varN1 + action + varN2 + " = " + (varN1 * varN2));
			} else if (action.equals("/")) {
				if (varN2 == 0) {
					System.out.println(" На \"0\" делить нельзя!");
				} else {
					System.out.println(varN1 + action + varN2 + " = " + ((double) varN1 / +varN2));
				}
			}
		}
	}
}
