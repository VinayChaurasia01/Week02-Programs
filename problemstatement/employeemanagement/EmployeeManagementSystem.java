package problemstatement.employeemanagement;

import java.util.ArrayList;
import java.util.List;

abstract class Employee{
    private int employeeId;
    private String employeeName;
    private float baseSalary;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Employee(int employeeId , String employeeName , float baseSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
    }

    abstract float calculateSalary();

    public void displayDetails(){
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Base salary : " + baseSalary);
    }
}

interface Department{
    void assignDepartment(String department);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department{
     public String department;
     public float bonus;

     public FullTimeEmployee(int employeeId , String employeeName , float salary , float bonus){
         super(employeeId,employeeName,salary);
         this.bonus = bonus;
         super.displayDetails();
     }

     public void assignDepartment(String department){
         this.department = department;
     }

     public String getDepartmentDetails(){
         return department;
     }

     public float calculateSalary(){
         return getBaseSalary() + bonus;
     }

     public void displayDetails(){
         System.out.println("It is Full time employee ! ");
         System.out.println("Department : "  + getDepartmentDetails());
         System.out.println("Bonus : " + bonus);
         System.out.println("Total Salary : " + calculateSalary());
     }
}

class PartTimeEmployee extends Employee implements Department{
    public String department;
    public int workingHours;

    public PartTimeEmployee(int employeeId , String employeeName , float salary , int workingHours){
        super(employeeId,employeeName,salary);
        this.workingHours = workingHours;
    }

    public void assignDepartment(String department){
        this.department = department;
    }

    public String getDepartmentDetails(){
        return department;
    }

    public float calculateSalary(){
        return getBaseSalary()*workingHours;
    }

    public void displayDetails(){
        System.out.println("It is part time employee ! ");
        super.displayDetails();
        System.out.println("Department : "  + getDepartmentDetails());
        System.out.println("Bonus : " + workingHours);
        System.out.println("Total Salary : " + calculateSalary());
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();

        FullTimeEmployee employee1 = new FullTimeEmployee(101 , "Travis" , 20000f , 2500f);
        employee1.assignDepartment("AI");
        employee1.displayDetails();

        employee.add(employee1);

        System.out.println();


        PartTimeEmployee employee2 = new PartTimeEmployee(102 , "Steve" , 100f , 6);
        employee2.assignDepartment("Data Entry");
        employee2.displayDetails();

        employee.add(employee2);


    }
}
