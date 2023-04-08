import java.util.Scanner;
public class SI{
public static void main(String[]args)
{
int simpleinterest,r;
Scanner sc=new Scanner(System.in);
System.out.println("enter the age:");
int age=sc.nextInt();
System.out.println("enter the principal:");
int p=sc.nextInt();
System.out.println("enter the time period:");
int t=sc.nextInt();
if(age>=59){
    r=12;
}
else{
    r=10;
}
simpleinterest=(p*t*r)/100;
System.out.print("simple interest is:"+simpleinterest);
}
}


