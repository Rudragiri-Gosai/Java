import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        // Input: Take two integer inputs (a and b)
        System.out.print("Enter the first integer (a): ");
        int a = get.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = get.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        int quotient = 0;
        if (b != 0) {
            quotient = a / b;
        }

        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (b != 0) {
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero value for b.");
        }
        get.close();
    }
}
