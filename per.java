import java.util.*;
public class per
{
    public static long it(long n) 
    {
    	long dsum = 0;
    	long i;
    	for (i=1;i<=Math.sqrt(n);i++) 
    	{
    		if(n%i==0) 
    		{
    			if(i==n/i)
    			{
    				dsum += i;
    			}
    			else 
    			{
    				dsum += i;
    				dsum += n / i;
    			}
    		}
    	}
    	dsum=dsum-n;
    	if(dsum==n)
    	{
    	    return 1;
    	}
    	else
    	{
    	    return 0;
    	}
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		long i,temp;
    	System.out.print("Enter n: ");
    	long n=sc.nextLong();
    	i=1;
    	while(n>0) 
    	{
    		if(it(i)==1) 
    		{
    			System.out.print(i+" ");
    			n=n-1;
    		}
    		i=i+1;
    	}
    	System.out.println();
	}
}