import java.util.Locale;
import java.util.Scanner;

public class TheSmallestOfThreeNumbers {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		if (a <= b && a <= c) {
			System.out.println(a);
		} else if (b <= a && b <= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}
