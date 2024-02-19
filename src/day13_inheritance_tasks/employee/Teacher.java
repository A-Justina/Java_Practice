package day13_inheritance_tasks.employee;

public class Teacher extends Employee{

    public Teacher(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching.");
    }
}
/*
2.3 Teacher:
       - work(): Displays "[name] is teaching".
 */