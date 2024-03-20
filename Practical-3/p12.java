class S {
    String c;

    S(String c) {
        this.c = c;
    }

    public String getInfo() {
        return "Color: " + c;
    }
}

class C extends S {
    double r;

    C(String c, double r) {
        super(c);
        this.r = r;
    }

    public String getInfo() {
        return super.getInfo() + ", Radius: " + r;
    }
}

class R extends S {
    double w, h;

    R(String c, double w, double h) {
        super(c);
        this.w = w;
        this.h = h;
    }

    public String getInfo() {
        return super.getInfo() + ", Width: " + w + ", Height: " + h;
    }
}

class T extends S {
    double b, h;

    T(String c, double b, double h) {
        super(c);
        this.b = b;
        this.h = h;
    }

    public String getInfo() {
        return super.getInfo() + ", Base: " + b + ", Height: " + h;
    }
}

public class p12 {
    public static void main(String[] args) {
        C c = new C("Red", 5.0);
        System.out.println(c.getInfo());

        R r = new R("Blue", 4.0, 6.0);
        System.out.println(r.getInfo());

        T t = new T("Green", 3.0, 4.0);
        System.out.println(t.getInfo());
    }
}
