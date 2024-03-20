import java.lang.Math;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    String getInfo() {
        return "Circle with radius " + radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    String getInfo() {
        return "Rectangle with width " + width + " and height " + height;
    }

    double area() {
        return width * height;
    }

    double peri() {
        return 2 * (width + height);
    }
}

class Triangle {
    double side1;
    double side2;
    double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    String getInfo() {
        return "Triangle with sides " + side1 + ", " + side2 + ", and " + side3;
    }

    double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    double peri() {
        return side1 + side2 + side3;
    }
}

public class p13 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle t = new Triangle(3, 4, 5);

        System.out.println(circle.getInfo());
        System.out.println(rectangle.getInfo());
        System.out.println(t.getInfo());

        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Area of the rectangle: " + rectangle.area());
        System.out.println("Area of the triangle: " + t.area());

        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());
        System.out.println("Perimeter of the rectangle: " + rectangle.peri());
        System.out.println("Perimeter of the triangle: " + t.peri());
    }
}
