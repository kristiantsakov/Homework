import java.util.Locale;
import java.util.Scanner;

public class PointsInsideAFigure {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		float x = input.nextFloat();
		float y = input.nextFloat();
		boolean figure1 = ((x >= 12.5 && x <= 22.5) && (y >= 6 && y <= 8.5));
		boolean figure2 = ((x >= 12.5 && x <= 17.5) && (y >= 8.5 && y <= 13.5));
		boolean figure3 = ((x >= 20 && x <= 22.5) && (y >= 8.5 && y <= 13.5));
		if (figure1 || figure2 || figure3 == true) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}
}
