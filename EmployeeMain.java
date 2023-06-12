package oopProblems;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Jon", "HR Manager", 40000);
	    Employee employee2 = new Employee("snow", "Software Engineer", 60000);
	    System.out.println("\nEmployee Details:");
	    employee1.printEmployeeDetails();
	    System.out.println();
	    employee2.printEmployeeDetails();

	    employee1.raiseSalary(8);
	    employee2.raiseSalary(12);

	    System.out.println("\n8% increment for 'jon':");
	    employee1.printEmployeeDetails();
	    System.out.println("\n12% increment for 'snow':");
	    employee2.printEmployeeDetails();
	}

}
