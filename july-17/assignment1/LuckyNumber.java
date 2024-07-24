package assignment1;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        int temp = num;
        int count = 1;

        
        while (temp != 0) {
            int digit = temp % 10;
            if (count % 2 != 0 ) {
                sum = sum+(digit * digit);
              
            }
            temp /= 10;
            count++;
        }

       
        if (sum % 9 == 0) {
            System.out.println("The number " + num + " is a lucky number.");
        } else {
            System.out.println("The number " + num + " is not a lucky number.");
        }
    }
}
