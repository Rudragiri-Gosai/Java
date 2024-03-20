class Circle {
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

    public void display() {
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter : " + getPerimeter());
    }
}

public class p20 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        c1.display();
    }
}
