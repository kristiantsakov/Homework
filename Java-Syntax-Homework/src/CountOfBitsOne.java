import java.math.BigInteger;
import java.util.Scanner;

public class CountOfBitsOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger n = input.nextBigInteger();
		int count = 0;
		for (int i = 0; i < 16; i++) {
			if (n.testBit(i) == true) {
				count++;
			}
		}
		System.out.println(count);
	}
}