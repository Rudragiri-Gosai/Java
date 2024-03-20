abstract class Shape {
    protected int numberOfSides;

    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
        numberOfSides = 0;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class p14 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}
