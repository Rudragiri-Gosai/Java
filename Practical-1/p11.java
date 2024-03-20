import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = get.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = get.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum of the array elements is: " + sum);
        get.close();
    }
}