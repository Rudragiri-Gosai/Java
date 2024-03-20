class ParentClass {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class ChildClass extends ParentClass {
    public void display() {
        System.out.println("This is the child class.");
    }
}

public class p4 {
    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        ChildClass childObj = new ChildClass();

        parentObj.display();
        childObj.display();
    }
}
