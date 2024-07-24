package assignment1;
import java.util.Scanner;
public class ReverseNaturalNum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = sc.nextInt();

        System.out.println("Natural numbers from " + n + "-1 in reverse: ");

       
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(", ");
            }
        }
    }
}

