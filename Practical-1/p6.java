import java.util.Scanner;
public class p6{
	public static void main(String[] args){
	Scanner get = new Scanner(System.in);
	double c=0;
	double f=0;
	System.out.println("Enter you temperature in celsius ::");
	c = get.nextFloat();
	f=(c*1.8)+32;
	System.out.println("Your Temperature in fahrenhieit is :: " + f);
	get.close();
}
}