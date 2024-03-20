class Rectangle1 {
    private double length;
    private double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Circle1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class ShapeTester1 {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(4, 6);
        Circle1 c1 = new Circle1(5);

        System.out.println("Rectangle:");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
    }
}
