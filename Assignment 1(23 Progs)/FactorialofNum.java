import java.util.Scanner;
public class FactorialofNum {
   public static void main(String args[]){
      int i =1, factorial=1, num;

      System.out.println("Enter the number to which you need to find the factorial:");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();

      while(i <=num) {
         factorial = factorial * i;
         i++;
      }
      System.out.println("Factorial of the given number is:: "+factorial);
   }
}