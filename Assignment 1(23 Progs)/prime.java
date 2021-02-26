import java.util.*;
class prime
{  
 public static void main(String args[]){  
  int i;    
  Scanner in=new Scanner(System.in);
  System.out.print("Enter the number to be checked : ");
  int n=in.nextInt(); 
  boolean flag = false;
    for (i = 2; i <= n/2; ++i) {
      if (n % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag)
      System.out.println(n+" is a prime number");
    else
      System.out.println(n+" is not a prime number");
}
}