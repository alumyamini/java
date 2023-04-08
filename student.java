interface Exam {
 
 void Percent_cal();
}

class Student {
 
 String name;
 int roll_no, Marks1, Marks2;
 Student(String n, int rn, int m1, int m2) {
  
  name = n;
  roll_no = rn;
  Marks1 = m1;
  Marks2 = m2;
  Marks3=m3;
   Marks4=m4;
 }
 
 void show() {
  
  System.out.println("Student Name : "+name);
  System.out.println("Roll no : "+roll_no);
  System.out.println("Marks1 : "+Marks1);
  System.out.println("Marks2 : "+Marks2);
   System.out.println("Marks3 : "+Marks3);
   System.out.println("Marks4 : "+Marks4);
 }
}

class Result extends Student implements Exam {
 
 float per,a;
 Result(String n,int rn,int m1,int m2,int m3,int m4) {
  
  super(n,rn,m1,m2,m3,m4);
 }
 
 public void Percent_cal() {
  
  int tot = Marks1 + Marks2+Marks3+Marks4;
  per = (float)tot / 4;
if(Mark1<50 || Marks2 <50 || Marks3 <50 || Marks4<50)
		{
			System.out.print("Grade: Fail");	
			return;
		}
		if(per>=75)
		{
			System.out.println("Distincttion");
		}
		if(per>=60 && per<75)
		{
			System.out.println("First Division");
		}
		if(per>=50 && per<60)
		{
			System.out.println("Second Division");
		}
                if(per>=40 && per<50)
                {
                        System.out.println("third division");
                 }
	}
 }
 
 void display() {
  
  show();
  System.out.println("Percentage = "+per);
 } 
 
}

public class StudentDetails {
 
 public static void main (String[] args) {
  
  Result r = new Result("Aashish",11,75,95);
  r.Percent_cal();
  r.display();
 }
}