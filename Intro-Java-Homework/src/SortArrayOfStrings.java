import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		String[] cities = new String[n+1];
			for (int i = 0; i <= n; i++) {
				cities[i] = sr.nextLine();
			}
		Arrays.sort(cities);
			for (int i = 0; i < cities.length; i++) {
				System.out.println(cities[i]);
			}
	}
}
