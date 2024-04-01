import java.util.Scanner;
public class employee{
int eNo;
String eName;
double eSalary;
public void getdetails(){
System.out.println("Enter the employee details: ");
Scanner sc = new Scanner(System.in);
System.out.println("Employee number : ");
eNo=sc.nextInt();
System.out.println("Name : ");
sc.nextLine();
eName=sc.nextLine();
System.out.println("Salary : ");
eSalary=sc.nextDouble();
}

void display(){
System.out.println("Employee number : "+eNo);
System.out.println("Name : "+eName);
System.out.println("Employee number : "+eSalary);
}

public static void main(String[] args){
System.out.println("Enter the No.of Employees : ");
Scanner sc1= new Scanner(System.in);
int num =sc1.nextInt();
employee arr[]=new employee[num];
for(int i=0;i<num;i++){
arr[i]=new employee();
arr[i].getdetails();
}
System.out.println("Information of all Employees : ");
for(int i=0;i<num;i++){
arr[i].display();
}

boolean state=false;
System.out.println("Enter the employees numberto get details of a employee");
int num2=sc1.nextInt();
for(int i=0;i<num;i++){
if(arr[i].eNo==num2){
System.out.println("Employee Details");
arr[i].display();
}
}
}
}

