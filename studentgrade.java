import java.util.Scanner;
import java.util.*;
import java.io.*;
interface one
{
     public void start();
}
interface two
{
     public void play();
}
interface three extends one,two
{
    public void start();
}
class child implements three
{
    public void start()
       {
            Scanner sc=new Scanner(System.in);
            int p,py,c,j,to,a;
             System.out.print("enter physics marks:");
             p=sc.nextInt();
             System.out.print("enter python marks:");
             py=sc.nextInt();
             System.out.print("enter chemistry marks:");
             c=sc.nextInt();
              System.out.print("enter java marks:");
               j=sc.nextInt();
              to=p+py+c+j;
               a=(to/400)*100;
                if(a>=75)
                 {
                    System.out.println("distinction");
                  }
                 else  if(a>=60 && a<75)
                   {
                       System.out.println("first division");
                    }
                  else if(a>=50 && a<60)
                    {
                          System.out.println("second division");
                     }
                    else if(a>=40 && a<50)
                      {
	        System.out.println("Third Division");
	     }
	    else
	     {
	        System.out.println("Fail");
	      }
                 }
             public void play()
                 {
                   System.out.println("");
                  }
   }
 public class studentgrade
{
  public void main(String[] args)
       {
           child c=new child();
           c.start();
            c.play();
         }
  }


                    