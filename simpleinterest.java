import java.util.Scanner;
public class simpleinterest
{
    public static void main(String args[]) 
    {
        float p,age,r,t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter age:");
        age=scan.nextFloat();
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        if(age<11){
          r=15;
         }
        else if(age>59){
          r=12;
        }
        else{
           r=10;
         }
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);
    }
}