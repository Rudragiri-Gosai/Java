class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person [Name = " + name + ", Age = " + age + "]";
    }
}

public class p16 {
    public static void main(String[] args) {
        Person p = new Person("abc", 20);
        String Val_Str = p.toString();
        System.out.println(Val_Str);
    }
}