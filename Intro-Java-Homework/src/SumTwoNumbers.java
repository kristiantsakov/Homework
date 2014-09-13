import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sr = new Scanner(System.in);
		int a = sr.nextInt();
		int b = sr.nextInt();
		System.out.println(a+b);
	}
}
