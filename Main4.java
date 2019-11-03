package by.htp.les01.main;

public class Main4 {

	public static void main(String[] args) {
		// С помощью оператора while напишите программу вывода всех четных чисел в диапазоне
		// от 2 до 100 включительно.
		int i = 2;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.print(i + ",");
			}
			i++;
		}
    }
}
