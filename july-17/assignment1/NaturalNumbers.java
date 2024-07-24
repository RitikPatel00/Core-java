package assignment1;
import java.util.Scanner;
public class NaturalNumbers {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input upper limit: ");
	        int n = sc.nextInt();

	        System.out.print("Natural numbers from 1 to " + n + ": ");

	       
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i);
	            if (i < n) {
	                System.out.print(", ");
	            }
	        }
	    }
}
