import java.util.*;
class MmultipleN
{
public static void main(String args[])
{
int m,n;
Scanner in=new Scanner(System.in);
System.out.print("Enter m : ");
m=in.nextInt();
System.out.print("Enter n : ");
n=in.nextInt();
if(m%n==0)
System.out.println(m+" is a multiple of "+n);
else
System.out.println(m+" is not a multiple of "+n);
}
}