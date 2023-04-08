import java.util.*;
class grade
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double to,p,c,m,ph,a;
		System.out.print("Enter the python marks: ");
		p=sc.nextInt();
		System.out.print("Enter the c programming marks: ");
		c=sc.nextInt();
		System.out.print("Enter the Maths marks: ");
		m=sc.nextInt();
		System.out.print("Enter the Physics marks: ");
		ph=sc.nextInt();
		if(p<50 || c<50 || m<50 || ph<50)
		{
			System.out.print("Grade: Fail");	
			return;
		}
		to=p+c+m+ph;
		a=(to/400)*100;
		System.out.println("Total= "+to);
		System.out.println("Aggregate= "+a);
		if(a>=75)
		{
			System.out.println("Distincttion");
		}
		if(a>=60 && a<75)
		{
			System.out.println("First Division");
		}
		if(a>=50 && a<60)
		{
			System.out.println("Second Division");
		}
                if(a>=40 && a<50)
                {
                        System.out.println("third division");
                 }
	}
}