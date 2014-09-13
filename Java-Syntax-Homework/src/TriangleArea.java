import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int aX = input.nextInt();
		int aY = input.nextInt();
		int bX = input.nextInt();
		int bY = input.nextInt();
		int cX = input.nextInt();
		int cY = input.nextInt();

		int a = aX * (bY - cY);
		int b = bX * (cY - aY);
		int c = cX * (aY - bY);
		if (aX == aY || bX == bY || cX == cY) {
			System.out.println("0");
		} else {
			System.out.println(Math.abs((a + b + c) / 2));
		}
	}
}
