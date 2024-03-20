class S {
    String c;

    S(String c) {
        this.c = c;
    }
}

class C extends S {
    double r;

    C(String c, double r) {
        super(c);
        this.r = r;
    }

    double a() {
        return Math.PI * r * r;
    }
}

class R extends S {
    double w, h;

    R(String c, double w, double h) {
        super(c);
        this.w = w;
        this.h = h;
    }

    double a() {
        return w * h;
    }
}

class T extends S {
    double b, h;

    T(String c, double b, double h) {
        super(c);
        this.b = b;
        this.h = h;
    }

    double a() {
        return 0.5 * b * h;
    }
}

public class p11 {
    public static void main(String[] args) {
        C c = new C("Red", 5.0);
        System.out.println("Area of circle: " + c.a());

        R r = new R("Blue", 4.0, 6.0);
        System.out.println("Area of rectangle: " + r.a());

        T t = new T("Green", 3.0, 4.0);
        System.out.println("Area of triangle: " + t.a());
    }
}
