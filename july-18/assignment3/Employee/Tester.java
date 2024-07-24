package assignment3.Employee;


public class Tester {
	public static void main(String[] args) {
	       
		// Create an Employee
        Employee employee = new Employee(1001, "John", "Doe", 50000);
        System.out.println("Employee: " + employee);
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println();

        // Raise the employee's salary by 10%
        int newSalary = employee.raiseSalary(10);
        System.out.println("Employee after 10% raise: " + employee);
        System.out.println("New Annual Salary: " + employee.getAnnualSalary());
        System.out.println();

        // Set the employee's salary directly
        employee.setSalary(60000);
        System.out.println("Employee after setting salary to 60000: " + employee);
        System.out.println("New Annual Salary: " + employee.getAnnualSalary());
	
}
}
