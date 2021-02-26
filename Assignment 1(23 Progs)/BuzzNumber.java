import java.util.Scanner;
public class BuzzNumber {
	public static void main(String args[]) throws Exception {
 
		int enteredNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		enteredNumber = scanner.nextInt();

		if (enteredNumber % 10 == 7 || enteredNumber % 7 == 0) {
			
			System.out.println("Entered number " + enteredNumber + " is a Buzz number.");
			
		}else {
			
			System.out.println("Entered number " + enteredNumber + " is not a Buzz number.");
			
		}
	}
 
}