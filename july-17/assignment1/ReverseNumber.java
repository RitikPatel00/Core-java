package assignment1;
import java.util.Scanner;
public class ReverseNumber {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input number: ");
	        int num = sc.nextInt();
             int temp=num;
	        int rev = 0;
	        boolean isNegative = false;

	        
	        if (num < 0) {
	            isNegative = true;
	            temp = Math.abs(temp);
	        }

	       
	        while (temp != 0) {
	            int digit = temp % 10;
	            rev = rev * 10 + digit;
	            temp /= 10;
	        }

	        // Printing the reversed number
	        if (isNegative) {
	            System.out.println("Reverse of -" + Math.abs(num) + " = -" + rev);
	        } else {
	            System.out.println("Reverse of " + num + " = " + rev);
	        }
	    }
}
