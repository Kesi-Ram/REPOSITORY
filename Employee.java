//KACEY ROYCE TYNE SANGBAAN
//CITCS 1N-A
import java.util.Scanner;

class Employee{
    //Attributes
    private String employeeID;
    private String employeeName;
    private double hourlyWage;
    private double hoursWorked;


    //Constructors
    public Employee(String employeeID, String employeeName, double hourlyWage, double hoursWorked){

        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    //Methods
    public double calculateSalary(){
        return hourlyWage * hoursWorked;
    }
    public void EmployeeDetails(){
        System.out.println("EmployeeID: " +employeeID+",Employee Name: "+employeeName+ ",Hourly Wage: "+ hourlyWage +",Hours worked: "+ hoursWorked);
        System.out.println("Calculated Salary: " + calculateSalary());
    }

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Scanner to get the info
    System.out.print("ID: ");
    String ID = sc.nextLine();

    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Hourly Wage: ");
    double hourlyWage = sc.nextDouble();

    System.out.print("Hours Worked: ");
    double hoursWorked = sc.nextDouble();
    Employee employeez1 = new Employee(ID, name, hourlyWage, hoursWorked);



    //Prints out the deails through methods
    System.out.println("\nEmployee details: \n");
    employeez1.EmployeeDetails();
    employeez1.calculateSalary();
    sc.close();
 }
}
