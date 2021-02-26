import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();

        if (number < 0.0)
            System.out.println(number + " is a negative number.");

        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

        else
            System.out.println(number + " is 0.");
    }
}