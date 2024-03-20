abstract class Shape {
    protected int numberOfSides;

    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        numberOfSides = 4;
    }

    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        numberOfSides = 3;
    }

    double calculateArea() {
        return (base * height) / 2;
    }
}

public class ShapeTester {
    public static void printShapeArea(Shape shape) {
        System.out.println("Area of the shape: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);

        System.out.println("Area of Reactangle is :: ");
        printShapeArea(rectangle);
        System.out.println("Area of traianle is :: ");
        printShapeArea(triangle);
    }
}
