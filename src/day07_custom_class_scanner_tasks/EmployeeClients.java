package day07_custom_class_scanner_tasks;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "John";
        employee1.age = 50;
        employee1.gender = 'M';
        employee1.jobTitle = "CEO";
        employee1.salary = 200_000.00;

        employee1.work();
        System.out.println(employee1);
        System.out.println("------------------------------");

        Employee employee2 = new Employee();
        employee2.name = "Kevin";
        employee2.age = 45;
        employee2.gender = 'M';
        employee2.jobTitle = "Manager";
        employee2.salary = 100_000.0;
        employee2.work();
        System.out.println(employee2);

    }
    }

