import java.util.Scanner;
class student{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.print("Enter the number  of subjects : ");
int numSubjects=s.nextInt();
int[] marks=new int[numSubjects];
System.out.println("----Marks of Each Subjects---- : ");
for(int i=0;i<numSubjects;i++){
System.out.print("Enter the marks for subject " +(i+1) + ": ");
marks[i]=s.nextInt();
}

int totalmarks=0;
for(int mark : marks){
totalmarks+=mark;
}

double percentage =(double)totalmarks / numSubjects;
System.out.println("Total marks : " + totalmarks);
System.out.println("Percentage : " + percentage + "%");
}
}


