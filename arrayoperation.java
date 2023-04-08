import java.util.Scanner;
import java.util.*;
public class arrayoperation
{
       public static void main(String[] args)
        {
           try
            {
                Scanner sc=new Scanner(System.in);
                Scanner s=new Scanner(System.in);
                System.out.print("enter the choice:");
                int choice=sc.nextInt();
                System.out.print("enter number of elements:");
                 int n=sc.nextInt();
                 int a[]=new int[n];
                System.out.print("enter the elements:");
                for(int i=0;i<n;i++)
                 {
                     if(!sc.hasNextInt())
                       {
                           System.out.print("enter only integers");
                           return;
                       }
                     a[i]=sc.nextInt();
                 }
                 switch(choice)
                   {
                        case 1:
                                 int j=0,k=0;
                                 int odd[] = new int[n];
                                 int even[] = new int[n];
                                 
                               for(int i = 0; i < n; i++)
                                  {
                                      if(a[i] % 2 != 0)
                                        {
                                          odd[j] = a[i];
                                           j++;
                                       }
                                    else
                                     {
                                      even[k] = a[i];
                                       k++;
                                     }
                               }
                         System.out.print("Odd:");
                      if(j > 1)
                     {
                       for(int i = 0;i < (j-1); i++)
                       {
                          System.out.print(odd[i]+",");
                       }
                      System.out.print(odd[j-1]);
                  }
                else
                {
                  System.out.println("No number");
                }
              System.out.println("");
                 System.out.print("Even:");
                if(k > 1)
               {
                       for(int i = 0; i < (k-1); i++)
                       {
                          System.out.print(even[i]+",");
                       }
                      System.out.print(even[k-1]);
               }
            else
              {
                 System.out.println("No number");
              }
               break;
             case 2:
                      int i,c,count=0,co=0;
                       
                       for(i=0;i<n;i++)
		{
		    if(a[i]==1)
		    {
		        System.out.println("1 is not a prime nor a composite");
		   }
		System.out.print("\nComposite: ");
		for(i=0;i<n;i++)
		{
		    c=0;
    		for(j=1;j<=a[i];j++)
    		{
    		    if(a[i]%j==0)
    		    {
    		        c++;
    		    }
    		}
    		if(c>2)
    		{
    	                      co++;
    	                    System.out.print(" "+a[i]);
    	                   }
	              }
                           }
	   System.out.print("\nNo. of Composite= "+co);
                     break;
               case 3:
                            int array1[] = new int[n];
                          System.out.println("Enter all the elements:");
                        for( i = 0; i < n; i++)
                        {
                       array1[i] = s.nextInt();
                        }
                     int array2[] = new int[n];
                    System.out.println("Enter all the elements:");
                    for(i = 0; i < n; i++)
                     {
                       array2[i] = s.nextInt();
                    }
                   System.out.println("Array1 : "+Arrays.toString(array1));
                   System.out.println("Array2 : "+Arrays.toString(array2));
 
      
                    for ( i = 0; i < array1.length; i++)
                   {
                      for ( j = 0; j < array2.length; j++)
                        {
                             if(array1[i] == (array2[j]))
                                  {
                 
                                     System.out.println("Common element is : "+(array1[i]));
                                 }
                       }
                  }
                  break;
                 default:
                     break;
             }
          }
       catch(Exception e)
        {
               System.out.print("invalid input");
         }
}
}
                          
                               
                   