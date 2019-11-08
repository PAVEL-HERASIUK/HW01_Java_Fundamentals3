package by.htp.les01.main;

public class Main38 {

	public static void main(String[] args) {
		// 38. Для заданного натурального числа определить, образуют ли его цифры
		// арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр.
		// Например: 1357, 963.
		boolean res = true;
		int a = 963;
		int varA = a;
		int ostat1 = varA % 10;
		varA = varA / 10;
		int ostat2 = varA % 10;
		varA = varA / 10;
		int raznost = ostat1 - ostat2;
		while (varA > 0) {
			ostat1 = varA % 10;
			if (ostat2 - ostat1 != raznost) {
				System.out.println(" Цифры числа " + a + " не образуют арифметическую прогрессию.");
				res = false;
				break;
			}
			ostat2 = ostat1;
			varA = varA / 10;
		}
		if (res) {
			System.out.println(" Цифры числа " + a + " образуют арифметическую прогрессию.");
		}
	}
}
