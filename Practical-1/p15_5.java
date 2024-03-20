import java.util.*;

public class p15_5 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int rows = get.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        get.close();
    }
}
