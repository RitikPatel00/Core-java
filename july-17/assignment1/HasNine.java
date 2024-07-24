package assignment1;

import java.util.Scanner;

public class HasNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(hasNine(numbers));
    }

    public static boolean hasNine(int[] numbers) {
        if (numbers.length < 4) {
            for (int num : numbers) {
                if (num == 9) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                if (numbers[i] == 9) {
                    return true;
                }
            }
        }
        return false;
    }
}
