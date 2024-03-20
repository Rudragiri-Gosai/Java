class S {
    public void display() {
        System.out.println("Shape Class");
    }
}

class Circle extends S {
    double r;

    double area() {
        return Math.PI * r * r;
    }
}

class Reactangle extends S {
    double w;
    double h;

    double area() {
        return w * h;
    }

    double perimeter() {
        return 2 * (w + h);
    }
}

class Triangle extends S {
    double b;
    double h;

    double area() {
        return 0.5 * b * h;
    }

    double perimeter() {
        return 3 * b;
    }
}

public class p10 {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.r = 5.0;
        c.display();
        System.out.println("Area of circle: " + c.area());

        Reactangle r = new Reactangle();
        r.w = 4.0;
        r.h = 6.0;
        System.out.println("Area of rectangle: " + r.area());
        System.out.println("Perimeter of rectangle: " + r.perimeter());

        Triangle t = new Triangle();
        t.b = 3.0;
        t.h = 4.0;
        System.out.println("Area of triangle: " + t.area());
        System.out.println("Perimeter of triangle: " + t.perimeter());
    }
}
