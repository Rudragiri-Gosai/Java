class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

}

/**
 * p12
 */
public class p12 {

    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(8, 3));
        System.out.println("Multiplication: " + calculator.multiply(4, 6));
        System.out.println("Division: " + calculator.divide(10, 2));
    }
}
