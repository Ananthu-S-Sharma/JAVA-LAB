import java.util.Scanner;
public class stringmanipulation{
public static void main(String[] args){
System.out.println("Enter the String");
Scanner sc =new Scanner(System.in);
String str1=sc.nextLine();
System.out.println("Length of String=" +str1.length());
System.out.println("Character at first poisition = " +str1.charAt(1));
System.out.println("String contains 'col' sequence : "+str1.contains("col"));
System.out.println("String ends with e : " +str1.endsWith("e"));
System.out.println("Replace'col' with 'kol' : "+str1.replaceAll("col","kol"));
System.out.println("LOWERCASE : "+str1.toLowerCase());
System.out.println("UPPERCASE : "+str1.toUpperCase());
}
}

