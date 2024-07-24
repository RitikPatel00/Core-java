package assignment1;
import java.util.Scanner;
public class SumOfNaturalNo {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input upper limit: ");
        int n = scanner.nextInt();

        int sum = 0;

        //we can use that formula as well
        // (n*(n+1))/2
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of natural numbers 1-" + n + ": " + sum);
    }
	
}
