import java.util.Scanner;
public class studentmarks
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
         System.out.print("enter the number of students:");
         int n=sc.nextInt();
         int a[]=new int[n];
         System.out.print("enter the marks of students:");
         for(int i=0;i<n;i++)
          {
              if(!sc.hasNextInt())
               {
                   System.out.print("enter only integers");
                    return;
                }
              a[i]=sc.nextInt();
           }
             int  total=0;
            for(int i=0;i<n;i++)
             {  
               total=total+a[i];
              }
             System.out.println("total marks:"+total);
}
}