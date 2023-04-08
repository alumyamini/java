import java.util.Scanner;
public class ransom
{
    public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the ransom note:");
     String r=sc.nextLine();
     System.out.print("enter the magazine note:");
     String m=sc.nextLine();
     if(r==m)
     {
        System.out.println(""+true);
      }
      else
      {
           System.out.println(""+false);
      }
}
}
