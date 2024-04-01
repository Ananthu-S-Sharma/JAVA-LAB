import java.util.Scanner;
public class shapes{
void area(int r1){
double Area_val=3.14*r1*r1;
System.out.println("\nArea of circle is Radius "+r1+" ="+Area_val);
}

void area(int a1,int b1){
int Area_val=a1*b1;
System.out.println("\nArea of Rectangle with dimensions "+a1+" x "+b1+" = "+Area_val);
}


void area(int a1,int b1,int c1){
int Area_val=a1*b1*c1;
System.out.println("\nArea of Cuboid with dimensions "+a1+" x "+b1+" x "+c1+" = "+Area_val);
}

public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("\nEnter the length : ");
int l =sc.nextInt();
System.out.println("\nEnter the breadth : ");
int b = sc.nextInt();
System.out.println("\nEnter the height : ");
int h = sc.nextInt();
System.out.println("\nEnter the radius : ");
int r = sc.nextInt();

shapes obj1=new shapes();
obj1.area(r);
obj1.area(l,b);
obj1.area(l,b,h);
}
}




