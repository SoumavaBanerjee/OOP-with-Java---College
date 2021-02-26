import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {

        int reversed= 0, remainder, original;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check :");
        int num = sc.nextInt();

        original = num;
        while( num != 0 )
        {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num  /= 10;
        }

        if (original == reversed)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");
    }
}