import java.util.Scanner;
public class find{
 public static void main(String args[])
{
int n,x,flag=0,i=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the range : ");
n=s.nextInt();
int a[]=new int [n];
System.out.println("Enter the elements : ");
for(i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.println("Enter the elements to find : ");
x=s.nextInt();
for(i=0;i<n;i++){
if(a[i]==x){
flag=1;
break;
}
else
{
flag=0;
}
}
if(flag==1)
{
System.out.println("ELEMENTS FOUND......");
}
else
{
System.out.println("ELEMENTS NOT FOUND.....");
}
}
}
