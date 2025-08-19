package Assessment;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                evenSum =evenSum+number;  // Add to even sum
            } else {
                oddSum =oddSum+number;   // Add to odd sum
            }
        }

        // Display the results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}