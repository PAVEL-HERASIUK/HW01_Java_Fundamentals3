package by.htp.les01.main;

public class Main9 {

	public static void main(String[] args) {
		//9. Найти сумму квадратов первых ста чисел
		int n = 1;
        int sum = 0;
        while (n <= 100) {
            sum = (sum + (n*n)); 
            n++;
        }    
            System.out.println(sum);
    }
}
