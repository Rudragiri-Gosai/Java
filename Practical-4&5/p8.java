public class p9{
    public static void main(String[] args) {
        try {
            int dividend = 10;
            int divisor = 0;

            int result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
