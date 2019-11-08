package by.htp.les01.main;

public class Main20 {

	public static void main(String[] args) {
		// 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		// модуль которых
		// больше или равен заданному е. Общий член ряда имеет вид:
		int varN = 10;
		int i;
		double e = 0.08;
		double itog = 0;
		double sum = 0;
		for (i = 1; i < varN; i++) {
			sum = (double) 1 / ((3 * i - 2) * (3 * i + 1));
			if (Math.abs(sum) >= e) {
				itog = itog + Math.abs(sum);
			}
		}
		System.out.println(itog);
	}
}
