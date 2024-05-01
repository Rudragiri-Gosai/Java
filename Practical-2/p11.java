class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
    }

}

public class p11 {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Bhavya");
        person1.setAge(17);

        person1.introduce();
    }
}
