package by.htp.les01.main;

import java.util.Scanner;

public class Main32 {

	public static void main(String[] args) {
		// 32. Проверить введенную пользователем строку на наличие недопустимых
		// символов. В качестве первого символа допустимы только буквы и знак
		// подчеркивания. Остальные символы могут быть буквами, цифрами и знаком
		// подчеркивания.
		int i;
		boolean simvoly = true;
		Scanner scan = new Scanner(System.in);
		System.out.print(" Введите строку: ");
		String str = scan.next();
		for (i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == 0) {
				if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch == '_') {
					simvoly = true;
				} else {
					simvoly = false;
				}
			} else if (i > 0) {
				if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == '_') {
					simvoly = true;
				} else {
					simvoly = false;
				}
			}
		}
		if (simvoly) {
			System.out.println(" Строка \"" + str + "\" не содержит недопустимых символов");
		} else {
			System.out.println(" Строка \"" + str + "\" содержит недопустимые символы");
		}
	}
}
