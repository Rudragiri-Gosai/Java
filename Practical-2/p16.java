import java.util.Scanner;

class p16 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();

        
        scanner.close();

        
        String message = String.format("Hello, %s! You are %d years old and your favorite color is %s.", name, age, favoriteColor);
        System.out.println(message);
    }
}



