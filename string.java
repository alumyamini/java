import java.util.Scanner;
import java.util.*;
public class string
{
   public static void removeDuplicates(int[] a)
 	{
  		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		int n;
  		for (int i=0;i<a.length; i++)
		{
			set.add(a[i]);
		}
  		System.out.print(set);
 	}
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter a string");
      String str=sc.nextLine();
     System.out.print("enter the choice:");
     int choice=sc.nextInt();
     switch(choice) 
     {
       case 1:
           try
            {
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
    		    String re="",st;
    		    int i,ln;
    		    st=sc.next();
    		    ln=st.length();
    		    for(i=ln-1;i>=0;i--)
    		    {
    		        re=re+st.charAt(i);
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
               catch(ArithmeticException e)  
               {  
                 System.out.println(e);  
               }  
             break;
        case 2:
          try
            {
                
	    int n,or,re,rev=0;
		System.out.print("Enter: ");
		if(!sc.hasNextInt())
		{
		    System.out.println("Enter only Integers");
		    return;
		}
		n=sc.nextInt();
		or=n;
		while(n!=0)
		{
		    re=n%10;
		    rev=rev*10+re;
		    n=n/10;
		}
		System.out.print("Reverse: "+rev);
                      }
                   catch(ArithmeticException e)  
               {  
                 System.out.println(e);  
               }  
              break;
         case 3:
             try
             {
		int n,i;
		System.out.print("Enter no. of elements: ");
		if(!sc.hasNextInt())
		{	
			System.out.print("Invalid");
			return;
		}
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Enter elements: ");
			if(!sc.hasNextInt())
			{	
				System.out.print("Invalid");
				return;
			}
		      a[i]=sc.nextInt();
		}
 		removeDuplicates(a);
                       }
                       catch(ArithmeticException e)  
                     {  
                          System.out.println(e);  
                     }  
                   break;
      default:
          {
           System.out.print("enter the correct choice");
           }
           break;
   }
}
}
         
	
            