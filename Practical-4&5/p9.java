import java.util.InputMismatchException;
import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter integers (non-numeric value to exit):");

            while (true) {
                int num = scanner.nextInt();
                System.out.println("You entered: " + num);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Input is not an integer.");
        }
    }
}
