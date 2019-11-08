package by.htp.les01.main;

public class Main24 {

	public static void main(String[] args) {
		// 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его
		// состав. Преобразовать его в другое число, цифры которого будут следовать в
		// обратном порядке по сравнению с введенным числом.
		int varN = 1234;
		int varNcopy = varN;
		int sum = 0;
		int varNew = 0;
		while (varN > 0) {
			int ostatok = varN % 10;
			varN = (varN / 10);
			if (ostatok % 2 == 0) {
				sum = sum + ostatok;
			}
			varNew = varNew * 10 + ostatok;
		}
		System.out.println(" Сумма четных цифр числа " + varNcopy + " равна " + sum);
		System.out.println(" Число " + varNcopy + " в обратном порядке: " + varNew);
	}
}
