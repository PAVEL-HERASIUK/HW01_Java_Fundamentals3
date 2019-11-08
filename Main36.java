package by.htp.les01.main;

public class Main36 {

	public static void main(String[] args) {
		// 36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное
		// число, которое делится на их произведение. Найти эти числа.

		int i;
		int varN;
		for (i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				varN = i * 100 + j;
				if (varN % (i * j) == 0) {
					System.out.println(varN);
				}
			}
		}
	}
}