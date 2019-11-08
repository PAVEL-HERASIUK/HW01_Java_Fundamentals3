package by.htp.les01.main;

public class Main5 {

	public static void main(String[] args) {
		// 5. С помощью оператора while напишите программу определения суммы всех
		// нечетных чисел в диапазоне от 1 до 99 включительно.
		int i = 1;
		int sum = 0;
		while (i <= 99) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
