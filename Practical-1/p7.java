import java.util.Scanner;

public class p7 {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int n = 0;
		int i = 0;
		int firstterm = 0;
		int secondterm = 1;
		System.out.print("Enter the until you want to print fibonacci series :: ");
		n = get.nextInt();
		get.close();
		for (i = 1; i <= n; ++i) {
			System.out.print(firstterm + ",");
			int nextterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = nextterm;
		}
	}
}