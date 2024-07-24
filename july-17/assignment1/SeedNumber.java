package assignment1;

import java.util.Scanner;

public class SeedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        if (isSeed(firstNumber, secondNumber)) {
            System.out.println(firstNumber + " is a seed of " + secondNumber);
        } else {
            System.out.println(firstNumber + " is not a seed of " + secondNumber);
        }
    }

    public static boolean isSeed(int seed, int number) {
        int product = seed;
          
        // Multiply the seed by each of its digits
        while (seed > 0) {
            int digit = seed % 10;
            if (digit == 0) {
                return false; // If a digit is 0, the number cannot be a seed
            }
            product *= digit;
            seed /= 10;
        }

        // Check if the product is equal to the given number
        return product == number;
    }
}
