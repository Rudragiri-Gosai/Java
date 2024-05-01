public class p17 {
    public static void main(String[] args) {
        
        Person person = new Person("John Doe", 30, "123 Main St");

        
        person.introduce();

        
        Calculator calculator = new Calculator();

        
        int num1 = 10;
        int num2 = 5;
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));

        try {
            System.out.println("Division: " + calculator.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        
        double fahrenheitTemp = 68.0;
        double celsiusTemp = 20.0;
        System.out.println("Fahrenheit to Celsius: " + temperatureConverter.fahrenheitToCelsius(fahrenheitTemp));
        System.out.println("Celsius to Fahrenheit: " + temperatureConverter.celsiusToFahrenheit(celsiusTemp));
    }
}
