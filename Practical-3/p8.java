interface P1 {
    void methodP1();
}

interface P2 {
    void methodP2();
}

interface P12 extends P1, P2 {
}

class Q implements P12 {
    public void methodP1() {
        System.out.println("Method from P1");
    }

    public void methodP2() {
        System.out.println("Method from P2");
    }
}

public class p8 {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.methodP1();
        obj.methodP2();
    }
}
