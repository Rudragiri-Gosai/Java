import package1.*;

public class PackageTester {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20, 12345, "Computer Science");
        Teacher t1 = new Teacher("Jane", 35, "Mathematics");

        System.out.println(s1.toString());
        s1.setId(54321);
        s1.setMajor("Electrical Engineering");
        t1.setSubject("Physics");
        System.out.println(s1.toString());
        System.out.println(t1.toString());
    }
}
