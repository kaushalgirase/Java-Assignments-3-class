//3

package assignment3;
import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	private int empId;
	private String empName;
	private int noOfHours;
	private double empSalary;

	public Employee() {
		this.empId = empId;
		this.empName = empName;
		this.noOfHours = noOfHours;
		this.empSalary = empSalary;
	}

	void getInfo() {
		System.out.println("Enter Employee ID: ");
		empId = sc.nextInt();
		System.out.println("Enter Employee Name:");
		empName = sc.next();
		System.out.println("Enter number of hours employee worked: ");
		noOfHours = sc.nextInt();
		System.out.println("Enter Employee salary: ");
		empSalary = sc.nextDouble();
	}

	void addSal() {
		if (empSalary < 500) {
			empSalary = empSalary + 10;
		}
	}

	void addWork() {
		if (noOfHours >= 6) {
			empSalary = empSalary + 5;
		}
	}
	
	void display()
	{
		System.out.println("Employee ID is: "+empId);
		System.out.println("Employee Name is: "+empName);
		System.out.println("Employee final salary is: "+empSalary);
	}
	
	public static void main(String args[])
	{
		Employee emp = new Employee();
		emp.getInfo();
		emp.addSal();
		emp.addWork();
		emp.display();
	}


}
