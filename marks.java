import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
interface one 
{
    public void print_geek();
}
 
interface two 
{
    public void print_for();
}
 
interface three extends one, two 
{
    public void print_geek();
}
class child implements three 
{
    public void print_geek()
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("enter the number of students:");
         int n=sc.nextInt();
         int a[]=new int[n];
         System.out.print("enter the marks of students:");
         for(int i=0;i<=n;i++)
          {
              if(sc.hasNextInt())
               {
                   System.out.print("enter only integers");
                    return;
                }
              a[n]=sc.nextInt();
              if(a[i]<0)
              {
                     System.out.println("enter only positive numbers");
                      return;
               }
            }
              for(int i=0;i<n;i++)
               {  
               int  total=0;
               total=total+a[i];
               System.out.println("total marks:"+total);
               }
       }
  public void print_for()
   {
      System.out.println(""); 
   }
}
// Drived class
public class marks
{
    public static void main(String[] args)
{
        child c = new child();
        c.print_geek();
        c.print_for();
}
}
                           
              