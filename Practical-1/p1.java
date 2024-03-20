import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        int number = 3;
        float sum = 0;
        float[] num = new float[number];

        System.out.println("Enter Three Number :: ");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + (i + 1) + " Number : ");
            num[i] = get.nextFloat();
            sum += num[i];
        }
        float avg = (sum) / 3;
        get.close();
        System.out.println("The Average of Given number is :: " + avg);
        System.out.println("The Sum of Given number is :: " + sum);
    }
}
