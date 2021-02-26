import java.util.*;
class EulersNumber
{
public static void main(String args[])
{
double e=0;
int i,n;
Scanner in=new Scanner(System.in);
System.out.print("Enter the limit : ");
n=in.nextInt();
for(i=0; i<=n; i++)
{
 e=e+(1.0/factorial(i));
}
System.out.println(e);
}
static int factorial(int num)
{
int j,fact=1;
if(num==0||num==1)
{
return 1;
}
else
{
for(j=1; j<=num; j++)
{
fact=fact*j;
}
return fact;
}
}
}