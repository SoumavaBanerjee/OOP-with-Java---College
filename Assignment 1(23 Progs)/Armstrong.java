import java.util.*;
class Armstrong
{  
  public static void main(String[] args)  
{  
    int n,sum=0,d,temp;  
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the number to be checked : ");
    n=in.nextInt();
    temp=n;  
    while(n>0)  
    {  
    d=n%10;  
    sum=sum+(d*d*d);  
    n=n/10;  
    }  
    if(temp==sum)  
    System.out.println(temp+" is a armstrong number");   
    else  
    System.out.println(temp+" is not a armstrong number");   
   }  
}  