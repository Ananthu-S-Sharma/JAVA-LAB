import java.util.Scanner;
class Person {
    String name;
    String gender;
    String address;
    int age;
    
    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;
    
    public Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Enter Person Details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\nEnter Employee Details:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Company Name: ");
        String companyName = scanner.nextLine();
        System.out.print("Qualification: ");
        String qualification = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(name, gender, address, age, empId, companyName, qualification, salary);
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Gender: " + employee.gender);
        System.out.println("Address: " + employee.address);
        System.out.println("Age: " + employee.age);
        System.out.println("Employee ID: " + employee.empId);
        System.out.println("Company Name: " + employee.companyName);
        System.out.println("Qualification: " + employee.qualification);
        System.out.println("Salary: $" + employee.salary);
        
        
        scanner.close();
    }
}
