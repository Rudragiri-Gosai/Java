import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = get.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = get.nextInt();
            i++;
        }

        int max = array[0];
        i = 1;
        do {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        } while (i < size);

        System.out.println("The maximum value in the array is: " + max);
        get.close();
    }
}