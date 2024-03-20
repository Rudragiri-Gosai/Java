interface Demo {
    void display();
}

class Test implements Demo {
    public void display() {
        System.out.println("Hello Welcome TO Earth ...");
    }
}

public class p3 {
    public static void main(String[] args) {

        Test t1 = new Test();

        t1.display();
    }
}