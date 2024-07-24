package assignment1;
import java.util.Scanner;
public class DigitCounter {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input num: ");
	        int num = scanner.nextInt();

	        int count = 0;

	        
	        while (num != 0) {
	            count++;
	            num /= 10;
	        }

	        System.out.println("Number of digits: " + count);
	    }
}
