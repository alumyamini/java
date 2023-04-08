import java.util.Scanner;
public class average
{
public static void main(String[]args)
{
int sum=0,sum1=0,count=0,count1=0;
List<Integer>positive = new ArrayList<>();
List<Integer>negative = new ArrayList<>();
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int num=sc.nextInt();
while(num!=-1){
if(num>0)
{
    system
    count++;
    sum+=num;
}
else if(num<0)
{
      count1++;
      sum1+=num;
}
else if(num==-1)
{
break;
}
else
{
continue;
}
}
System.out.println("average of positive numbers:"+(sum/count));
System.out.println("average of negative numbers:"+(sum1/count1));
}
}


