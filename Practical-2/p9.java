class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    
}

class p9 {

    public static void main(String[] args) {
        Person person1 = new Person("Bhavya", 17);
        
        Person person2 = new Person(person1);
        
        System.out.println("Person 1:");
        person1.displayInfo();
        
        System.out.println("Person 2:");
        person2.displayInfo();
    }
}