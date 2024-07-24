package assignment1;
import java.util.Scanner;

public class DivisibleByDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isDivisibleByDigitSum(number)) {
            System.out.println(number + " is divisible by the sum of its digits");
        } else {
            System.out.println(number + " is not divisible by the sum of its digits");
        }
    }

    public static boolean isDivisibleByDigitSum(int num) {
        int digitSum = 0;

         int t=num;
        while (t > 0) {
            int digit = t % 10;
            digitSum += digit;
            t /= 10;
        }

      
        if(num % digitSum == 0) {
        	return true;
        }
        else {
        	return false;
        }
    }
}