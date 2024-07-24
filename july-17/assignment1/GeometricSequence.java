package assignment1;
import java.util.Scanner;
public class GeometricSequence {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int term = 1;
       if(n<=0) {
    	   System.out.println("please enter positive number");
       }
       else {
        System.out.print("Geometric sequence: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(term);
            if (i < n) {
                System.out.print(", ");
            }
            term *= 2;
        }
        
       }
    } 
}
