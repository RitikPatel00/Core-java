package assignment1;
import java.util.Scanner;

public class EvenNumbers {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input upper range: ");
	        int n = sc.nextInt();

	        System.out.println("Even numbers between 1 to " + n + ":");

	      
	        for (int i = 2; i <= n; i += 2) {
	            System.out.print(i);
	            if (i < n) {
	                System.out.print(", ");
	            }
	        }
	    }
}
