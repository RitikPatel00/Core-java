package assignment1;
import java.util.Scanner;
public class PowerOfNum {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input base: ");
	        int base = sc.nextInt();
	        System.out.print("Input exponent: ");
	        int expo = sc.nextInt();

	        int power = 1;

	       
	        for (int i = 1; i <= expo; i++) {
	            power = power * base;
	        }

	        System.out.println(base + " ^ " + expo + " = " + power);
	    }
}
