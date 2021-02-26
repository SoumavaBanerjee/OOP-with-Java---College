import java.util.Scanner;
public class MiletoKm {
	public static void main(String[] args) {

		double miles, kilometers;

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter miles:");
		miles = in.nextDouble();

		kilometers = miles * 1.6;

		System.out.println(kilometers + " Kilometers");

	}
}