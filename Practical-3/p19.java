interface Shape {
    double getArea();

    double getPerimeter();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
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

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class p19 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 6);
        Circle c1 = new Circle(5);

        System.out.println("Area of the rectangle: " + r1.getArea());
        System.out.println("Perimeter of the rectangle: " + r1.getPerimeter());

        System.out.println("Area of the circle: " + c1.getArea());
        System.out.println("Perimeter of the circle: " + c1.getPerimeter());
    }
}
