package day13_inheritance_tasks.employee;

public class EmployeeClients {

    public static void main(String[] args) {

        Tester tester = new Tester("Josh", 45, "Male", "12233", "Tester", 50000, "Amazon");
        System.out.println(tester);
        tester.work();

        Developer developer = new Developer("Maria", 35, "Female", "12345", "Developer", 100000, "ABC", "C++");
        System.out.println(developer);
        developer.eat();
        developer.work();

        Teacher teacher = new Teacher("Peter", 40, "Male", "25897", "Teacher", 80000, "School");
        System.out.println(teacher);

        Driver driver = new Driver("John", 60, "Male", "12396", "Driver", 10, "TowTruck");
        System.out.println(driver);
        driver.sleep();
    }
}
