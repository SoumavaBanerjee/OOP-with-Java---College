public class Pattern3
{
public static void main(String args[]) 
{
int i,j,k=1;
for(i=4-1;i>=0;i--) 
{ 
for(j=4-1;j>i;j--) 
{
System.out.print(" "); 
}
System.out.print(k); 
for(j=1;j<(i*2);j++) 
System.out.print(" "); 
if(i>=1) 
System.out.print(k); 
System.out.print("\n");
k++;
}
}
}