import java.util.Scanner;
 
/**
 * Java Program to reverse a number
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int N, reverse = 0, rightDigit;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter an Integer");
        N = scanner.nextInt();
 
        while (N != 0) {
            rightDigit = N % 10;
            reverse = (reverse * 10) + rightDigit;
            N = N / 10;
        }
        System.out.format("Reversed Number = %d\n", reverse);
    }
}