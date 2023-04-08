import java.util.Scanner;
 
public class Voting {
 
 public static void main(String[] args) 
 {
          // Declaring variables
          int age,shrt;
          // taking values from user at run time
 Scanner scan = new Scanner(System.in);
 System.out.println(" Please enter your age");
 age = scan.nextInt();
 // Checking condition for voting..
 if(age>=18)
 {
 System.out.println("Welcome to voting system Yo can Vote");
 }
 else
 {
 shrt= (18 - age);
 System.out.println("Sorry,You can vote after :"+ shrt + " years");
 }
 
 }
}
 