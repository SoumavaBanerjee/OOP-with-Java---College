import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	    System.out.print("Enter number:");        
	    int n=s.nextInt();
        System.out.print("Enter upper limit:");
        int upper = s.nextInt();
        System.out.print("Enter lower limit:");
        int lower = s.nextInt();
        
        for(int i=lower; i <= upper; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}