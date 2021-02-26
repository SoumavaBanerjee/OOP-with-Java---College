import java.util.*;
public class PrimebetweenInterval 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int start,end,i,j,flag;
		System.out.print("Enter lower bound of the interval : ");
		start= in.nextInt();
		System.out.print("Enter upper bound of the interval : ");
		end= in.nextInt();
		System.out.printf("Prime numbers between %d and %d are:\n",start,end);
		for (i =start; i <= end; i++)
		{
			if (i == 1 || i == 0)
				continue;
			flag = 1;
			for (j = 2; j <= i / 2; ++j) 
			{
				if (i % j == 0)
			        {
					flag = 0;
					break;
				}
			}   
			if (flag == 1)
				System.out.println(i);
		}
	}
}
