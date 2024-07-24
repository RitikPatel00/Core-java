package assignment1;
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int terms = scanner.nextInt();

        int a = 0, b = 1, c = 0;

        System.out.print("Fibonacci series: 0 1 ");

        for (int i = 3; i <= terms; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");
        }
    }
}
