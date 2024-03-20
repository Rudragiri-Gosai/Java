import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        double radius = 0;
        double area;

        System.out.println("Enter Your Circle Radius :: ");
        radius = get.nextDouble();
        area = (float) (Math.PI * radius * radius);

        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
        get.close();
    }
}
