package by.htp.les01.main;

public class Main26 {

	public static void main(String[] args) {
		// 26. Вывести на экран соответствий между символами и их численными
		// обозначениями в памяти компьютера (Таблицу ASCII).
		
		char ch;
		for (ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " (" + (byte) ch + "), ");
		}
		System.out.print("\n");
	}
}
