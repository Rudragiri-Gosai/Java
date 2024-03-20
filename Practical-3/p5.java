class A {
    void methodA() {
        System.out.println("This is class A method.");
    }
}

class B extends A {
    void methodB() {
        System.out.println("This is class B method.");
    }
}

class C extends B {
    void methodC() {
        System.out.println("This is class C method.");
    }
}

public class p5 {
    public static void main(String[] args) {
        C cObj = new C();
        cObj.methodA();
        cObj.methodB();
        cObj.methodC();
    }
}