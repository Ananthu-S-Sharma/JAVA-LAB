import java.util.Arrays;
import java.util.Scanner;

public class sortchar{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("Enter a string: ");
String inputString=scanner.nextLine();
char[] chars=inputString.toCharArray();
Arrays.sort(chars);

String sortedString=new String(chars);
System.out.println("Original String: " + inputString);
System.out.println("Sorted String: " + sortedString);
}
}
