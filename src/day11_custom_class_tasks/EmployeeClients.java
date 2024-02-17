package day11_custom_class_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "CEO");
        employee1.work();
        employee1.gender = 'M';
        System.out.println(employee1);
        System.out.println("===================================");

        Employee employee2 = new Employee("Peter", 35, 'M', "Manager", 80_000);
        employee2.work();
        System.out.println(employee2);
        System.out.println("===================================");

        Employee employee3 = new Employee("Kate", "Assistant");
        employee3.age = 30;
        employee3.gender = 'F';
        employee3.salary = 60_000;
        System.out.println(employee3);
        System.out.println("===================================");

    }
}
/*
Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each
	function of the employee object.
 */