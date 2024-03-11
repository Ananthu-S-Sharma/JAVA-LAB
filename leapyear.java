import java.util.Scanner;
class leapyear
{
public static void main(String args[])
{
int start,end;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the starting year: ");
start=obj.nextInt();
System.out.println("Enter the ending year: ");
end=obj.nextInt();
System.out.println("The leap years are: ");
for(int i=start;i<=end;i++)
{
if(i%400 ==0 ||(i%4==0 && i%100!=0))
System.out.println(i);
}
}
}
