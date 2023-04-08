import java.util.Scanner;
public class SumOfn 
{  
public static void main(String[] args)   
{  
int i, num , sum = 0; 
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit:");
num=sc.nextInt(); 
//executes until the condition returns true  
for(i = 1; i <= num; ++i)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
}  
//prints the sum   
System.out.println("Sum of First n Natural Numbers is = " + sum);  
}  
}  