import java.util.*;;

class DivsionExecption extends Exception {
    public DivsionExecption(String message) {
        super(message);
    }
}

public class p3 {
    public static double divide(int nu, int de) throws DivsionExecption {
        if (de == 0) {
            throw new DivsionExecption("Numerator cannot divide with Zero.");
        }
        return (double) nu / de;
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int Numerator, Denominator;
        System.out.print("Enter Numerator and Denominator respectively : ");
        Numerator = get.nextInt();
        Denominator = get.nextInt();
        try {
            double result = divide(Numerator, Denominator);
            System.out.println("Result of Divsion: " + result);
        } catch (DivsionExecption e) {
            System.out.println("Error : " + e.getMessage());
        }
        get.close();
    }
}
