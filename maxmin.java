import java.util.*;
public class maxmin
{
	public static void main(String[] args) 
	{
	    int x,i,j,m,n,desc,asce,max,min,diff,sum;
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		x=sc.nextInt();
		int a[]=new int[x];
		System.out.println("Enter elements: ");
		for(i=0;i<x;i++)
		{
		    a[i]=sc.nextInt();
		}
		System.out.print("M: ");
		m=sc.nextInt();
		System.out.print("N: ");
		n=sc.nextInt();
		if(m>x || n>x || m==0 || n==0)
		{
		    System.out.println("Invalid M,N");
		    return;
		}
		for(i=0;i<x;i++)
		{
		    for(j=i+1;j<x;++j)
		    {
		        if(a[i]<a[j])
		        {
		            desc=a[i];
		            a[i]=a[j];
		            a[j]=desc;
		        }
		    }
		}
		max=a[m-1];
		System.out.println(m+" Maximum no. is: "+max);
		for(i=0;i<x;i++)
		{
		    for(j=i+1;j<x;++j)
		    {
		        if(a[i]>a[j])
		        {
		            asce=a[i];
		            a[i]=a[j];
		            a[j]=asce;
		        }
		    }
		}
		min=a[n-1];
		sum=max+min;
		diff=max-min;
		System.out.println(n+" Minimum no. is: "+min);
		System.out.println("Sum= "+sum);
		System.out.println("Difference= "+diff);
	}
}