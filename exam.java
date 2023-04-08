import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;
interface one
{
    public void print_geek();
}
interface two
{
     public void print_for();
}
interface three extends one,two
{
   public void print_geek();
}
class child implements three
{
    public void print_geek()
   {
       Scanner sc=new Scanner(System.in);
        System.out.print("enter the python marks:");
        int p=sc.nextInt();
        System.out.print("enter the java marks:");
        int j=sc.nextInt();
        System.out.print("enter the mathematics marks:");
        int m=sc.nextInt();
        System.out.print("enter the physics marks:");
        int phy=sc.nextInt();
        System.out.print("enter the chemistry marks");
        int c=sc.nextInt();
        System.out.print("enter the ethics marks:");
         int e=sc.nextInt();
         int total=p+j+m+phy+c+e;
         int to=total/600;
         int agg=to*100;
         if(agg>75)
         {
               System.out.println("distinction");
         }
         else if(agg>=60 && agg<75)
         {
                System.out.println("first division");
          }
           else if(agg>=50 && agg<60)
           {
                 System.out.println("second division");
            }
           else if(agg>40 && agg<50)
            {
                  System.out.println("third division");
             }
              else
              {
                       System.out.println("false");
               }
     }
    public void print_for()
      {
           System.out.println("");
      }
}
public class grade
{
     public static void main(String[] args)
      {
           child c=new child();
            c.print_geek();
            c.print_for();
       }
}
          
