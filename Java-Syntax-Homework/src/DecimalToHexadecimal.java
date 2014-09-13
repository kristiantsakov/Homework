import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dec = input.nextInt();
		System.out.println(decToHex(dec).toUpperCase());
	}

	public static String decToHex(int dec) {
		String hex = Integer.toHexString(dec);
		return hex;
	}
}
