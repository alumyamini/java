import java.util.Scanner;
public class countofdigits {

  public static void main(String[] args) {
      int count=0;
     Scanner sc=new Scanner(System.in);
     System.out.print("enter the number:");
     if(!sc.hasNextInt())
     {
         System.out.print("enter only integers");
     }
      int num=sc.nextInt();
    while (num != 0) {
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}