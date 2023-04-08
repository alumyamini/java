import java.util.Scanner;
public class factors {

  public static void main(String[] args) {

    // positive number
    int number,c=0 ;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number");
     number=sc.nextInt();
    
    System.out.print("Factors of " + number + " are: ");

    // loop runs from 1 to 60
    while(number>0){
    for (int i = 1; i <= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
           c++;
        System.out.print(i + " ");
      }
    }
}
     System.out.print("\nNo. of factors= "+c);
  }
}