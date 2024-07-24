package assignment1;
import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            int fact = 1;

           
            for (int i = 1; i <= lastDigit; i++) {
                fact *= i;
            }

            sum += fact;
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is STRONG NUMBER");
        } else {
            System.out.println(originalNum + " is NOT a STRONG NUMBER");
        }
    }
}
