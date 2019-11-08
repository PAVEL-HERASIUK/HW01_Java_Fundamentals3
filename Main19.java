package by.htp.les01.main;

public class Main19 {

	public static void main(String[] args) {
		// 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		// модуль которых
		// больше или равен заданному е. Общий член ряда имеет вид
		int i;
		double sum;
		int varN = 1;
		double e = 0.987;
		double itog = 0;
		for (i = 1; i < varN; i++) {
			sum = (double) 1 / (Math.pow(2, i) + 1 / Math.pow(3, i));
			if (Math.abs(sum) >= e) {
				itog = itog + Math.abs(sum);
			}
		}
		System.out.println(itog);
	}
}
