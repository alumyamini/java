import java.util.*;
public class Palindrome
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter your choice(1.Numbers,2.String): ");
	    if(!sc.hasNextInt())
    	{
    	    System.out.println("Enter only integers");
    	    return;
    	}
	    int x=sc.nextInt();
	    if(x==1)
	    {
    		int a,r,or,rev=0;
    		System.out.print("Enter number: ");
    		if(!sc.hasNextInt())
    		{
    		    System.out.println("Enter only integers");
    		    return;
    		}
    		a=sc.nextInt();
    		or=a;
    		while(a!=0)
    		{
    		    r=a%10;
    		    rev=rev*10+r;
    		    a=a/10;
    		}
    		System.out.println("Reverse: "+rev);
    		if(or==rev)
    		{
    		    System.out.println("Palindrome");
    		}
    		else
    		{
    		    System.out.println("Not a Palindrome");
    		}
	    }
	    else if(x==2)
	    {
	        System.out.print("Enter string: ");
	        if(!sc.hasNextInt())
    		{
    		    String re="",str;
    		    int i,ln;
    		    str=sc.next();
    		    ln=str.length();
    		    for(i=ln-1;i>=0;i--)
    		    {
    		        re=re+str.charAt(i);
    		    }
    		    System.out.println("Reverse: "+re);
    		    if(str.equalsIgnoreCase(re))
    		    {
    		        System.out.println("Palindrome");
    		    }
    		    else
    		    {
    		        System.out.println("Not a palindrome");
    		    }
    		}
    		else
    		{
    		    System.out.println("Enter Only string");
    		}
	    }
	    else
	    {
	        System.out.println("Invalid choice");
	    }
	}
}