import java.util.Scanner;
class fibo{
  public static void main(String[] args) {

    int n , firstTerm , secondTerm;
     Scanner sc=new Scanner(System.in);
      System.out.println("enter number:");
       n=sc.nextInt();
       System.out.print("first term");
       firstTerm=sc.nextInt();
       System.out.print("second term:");
        secondTerm=sc.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + " ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
