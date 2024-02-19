package day13_inheritance_tasks.employee;

public class Driver extends Employee{

    public Driver(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getAge() + " is driving.");
    }
}
/*
2.4 Driver:
       - work(): Displays "[name] is driving".
 */