import java.util.*;
public class Denomination
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
        int x,y,m,n,z,a,a1,b,b1,c,c1,d,d1;
        System.out.print("Enter the 1st Denomination : ");
        a=sc.nextInt();
        System.out.print("Enter the 1st Denomination number of notes : ");
        a1=sc.nextInt();
        x=a*a1;
        System.out.print("Enter the 2nd Denomination : ");
        b=sc.nextInt();
        System.out.print("Enter the 2nd Denomination number of notes : ");
        b1=sc.nextInt();
        y=b*b1;
        System.out.print("Enter the 3rd Denomination : ");
        c=sc.nextInt();
        System.out.print("Enter the 3rd Denomination number of notes : ");
        c1=sc.nextInt();
        m=c*c1;
        System.out.print("Enter the 4th Denomination : ");
        d=sc.nextInt();
        System.out.print("Enter the 4th Denomination number of notes : ");
        d1=sc.nextInt();
        n=d*d1;
        z=x+y+m+n;
        System.out.print("Total Available Balance in ATM = "+z);
	}
}