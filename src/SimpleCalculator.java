import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        float firstNumberAitanov = scanner.nextFloat();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        float secondNumberAitanov = scanner.nextFloat();

        // Perform calculations
        float sumAitanov = firstNumberAitanov + secondNumberAitanov;
        float differenceAitanov = firstNumberAitanov - secondNumberAitanov;
        float productAitanov = firstNumberAitanov * secondNumberAitanov;
        float quotientAitanov = firstNumberAitanov / secondNumberAitanov;

        // Display the results with two decimal places
        System.out.printf("Sum: %.2f%n", sumAitanov);
        System.out.printf("Difference: %.2f%n", differenceAitanov);
        System.out.printf("Product: %.2f%n", productAitanov);
        System.out.printf("Quotient: %.2f%n", quotientAitanov);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
