import java.util.Scanner;
public class LargestofThree {
    public static void main(String[] args) {

    	Scanner reader = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = reader.nextInt();
        int n2 = reader.nextInt();
        int n3 = reader.nextInt();
        

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }
    }
}