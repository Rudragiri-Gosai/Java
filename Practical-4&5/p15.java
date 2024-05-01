import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 0, num2 = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();

                validInput = true; // Set flag to true if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter numeric values.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        try {
            double result = divide(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            // Prompt user to enter numbers again if division by zero occurs
            main(args);
        } catch (Exception e) {
            System.out.println("Error: An unexpected exception occurred.");
            e.printStackTrace(); // Print stack trace for other exceptions
        }

        scanner.close();
    }

    public static double divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}
