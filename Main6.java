package by.htp.les01.main;
import java.util.Scanner;
public class Main6 {

	public static void main(String[] args) {
		// 6. Напишите программу, где пользователь вводит любое целое положительное число. А
		//программа суммирует все числа от 1 до введенного пользователем числа.
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите любое целое положительное число: ");
		int a = scan.nextInt();
		int sum = 0;
		for (int i = 1; i < a; i++) {
			sum += i;
		}
			System.out.println(sum);
	 }
}

