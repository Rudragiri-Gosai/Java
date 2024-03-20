import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = get.next();
        if (input.equals(new StringBuilder(input).reverse().toString())) {
            System.out.println("The input is a palindrome");
        } else {
            System.out.println("The input is not a palindrome");
        }
        get.close();
    }
}