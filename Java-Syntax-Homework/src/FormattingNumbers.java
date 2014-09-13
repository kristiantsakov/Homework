import java.util.Locale;
import java.util.Scanner;
import java.lang.StringBuilder;

public class FormattingNumbers {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (0 <= a && a <= 500) {
			float b = input.nextFloat();
			String binary = Integer.toBinaryString(a);
			String bin = String.format("%10s", binary).replace(' ', '0');
			float c = input.nextFloat();
			String.format("%1$-" + 10 + "hex", decToHex(a).toUpperCase());
			System.out.printf("|%s|%10s|%10.2f|%-10.3f|",
					padRight(decToHex(a).toUpperCase(), 10), bin, b, c);
		}

	}

	public static String padRight(String s, int n) {
		return String.format("%1$-" + n + "s", s);
	}

	public static String padLeft(String s, int n) {
		return String.format("%1$" + n + "s", s);
	}

	public static String decToHex(int a) {
		String hex = Integer.toHexString(a);
		return hex;
	}
}
