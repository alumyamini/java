public class Totalof5subjects1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int english, chemistry, computers, physics, maths; 
	    float total, avg,grade;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();	
                                      if(maths || english || chemistry || computers || physics || maths >50)
		{
		total = english + chemistry + computers + physics + maths;
		avg = total / 5;
                                     System.out.println(" Total Marks =  " + total);
	                  System.out.println(" Average Marks =  " + Average);
                               system.out.print("the student grade is:");
                                      if(avg>75)
                                      {
                                          system.out.print("distinction");
                                       }
                                      else if(avg>=60 && avg<75)
                                       {
                                               system.out.print("first division");
                                       }
                                       else if (avg>=50 && avg<=60)
                                         {
                                                  system.out.print("second division");
                                          }
                                          else
                                            {
                                                    system.out.print("fail");
                                            }
                                          }
                                     else
                                       {
                                              system.out.print("invalid");
                                        }
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	  
	}
}