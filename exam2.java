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
         double p,r,t,m,to,e;
         Scanner sc=new Scanner(System.in);
          System.out.print("enter the choice:");
           int c=sc.nextInt();
            System.out.print("enter the loan amount:");
            p=sc.nextDouble();
            System.out.print("enter the time :");
             t=sc.nextDouble();
              m=t*12;
              if(c==1)
               {
                  System.out.print("bank =sbi");
                   r=0.084;
                    System.out.println("rate of interest is:"+r);
                   to=p*t*r;
                   e=to/m;
                    System.out.println("amount to be paid is:"+to);
                     System.out.print("emi is :"+e);
                 }
                else if(c==2)
                 {
                         System.out.print("bank =icici");
                         r=0.073;
                    System.out.println("rate of interest is:"+r);
                   to=p*t*r;
                   e=to/m;
                    System.out.println("amount to be paid is:"+to);
                     System.out.print("emi is :"+e);
                  }
                 else if(c==3)
                  {
                            System.out.print("bank =axis");
                            r=0.097;
                    System.out.println("rate of interest is:"+r);
                   to=p*t*r;
                   e=to/m;
                    System.out.println("amount to be paid is:"+to);
                     System.out.print("emi is :"+e);
                   }
                  else
                    {
                          System.out.print("invalid input");
                     }
          }
          public void play()
           {
             System.out.print("");
            }
 }
class bank
{
public static void main(String[] args)
{
     child c=new child();
      c.start();
      c.play();
}
}


      