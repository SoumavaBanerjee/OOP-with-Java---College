import java.util.Scanner;
public class DecimalBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to convert :");
        int num = sc.nextInt();
        long binary = convertDecimalToBinary(num);
        System.out.printf("%d in decimal = %d in binary", num, binary);
    }

    public static long convertDecimalToBinary(int num)
    {
        long binaryNumber = 0;
        int remainder, i = 1, step = 1;

        while (num!=0)
        {
            remainder = num % 2;
            num /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
}