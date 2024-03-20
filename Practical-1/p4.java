import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = get.nextInt();

        int reversedNumber = reverse(n);

        System.out.println("Reverse of " + n + " is: " + reversedNumber);
        get.close();
    }

    private static int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }

}
