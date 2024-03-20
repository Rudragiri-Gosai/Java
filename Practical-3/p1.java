public class p1 {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.display();
    }
}

class ParentClass {
    int num = 100;
}

class ChildClass extends ParentClass {
    int num = 50;

    void display() {
        System.out.println("Child class num: " + num);
        System.out.println("Parent class num: " + super.num);
    }
}
