import java.util.Scanner;
public class DivbyFive
{
    public static void main(String[] args) 
    {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = s.nextInt();
        if(num % 5 == 0)
        {
            System.out.println(num+" is divisible by 5");
        }
        else
        {
            System.out.println(num+" is not divisible by 5");
        }
    }
}