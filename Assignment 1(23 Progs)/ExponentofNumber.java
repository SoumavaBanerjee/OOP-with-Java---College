import java.util.Scanner;
public class ExponentofNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base :");
        int base = sc.nextInt();
        System.out.println("Enter exponent:");
        int exponent = sc.nextInt();

        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}