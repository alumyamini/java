import java.util.Scanner;

public class CountAlpDigiSpl2 {
	private static Scanner sc;
	public static void main(String[] args) {
		String aldisp_str;
		int i, spl;
		i =  spl = 0;
		char ch;
		
		sc= new Scanner(System.in);

		System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
		aldisp_str = sc.nextLine();
		
		while(i < aldisp_str.length())
		{
			ch = aldisp_str.charAt(i);
                                                         if(ch==! | ch==@ |ch==#| ch==%|ch==^|ch==&|ch==*|ch==$)
                                                         {
                                                             system.out.println("special chracaters="+ch);
                                                              spl++;
			}
			i++;
		}	
		System.out.println("Number of Special Characters   =  " + spl);
	}
}