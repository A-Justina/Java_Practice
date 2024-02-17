package day11_custom_class_tasks;

public class CydeoStudentClient {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Justina", 18,11111,3, 33, 5);
        System.out.println(student1.name + " is " + student1);
        student1.printSchoolName();
        student1.printProgLanguage();
        student1.attendClass();
        System.out.println("=========================================");

        CydeoStudent student2 = new CydeoStudent("Peter", 25, 11112, 2, 33, 8);
        System.out.println(student2);
        student2.printSchoolName();
        student2.study();
        System.out.println("=========================================");

        CydeoStudent student3 = new CydeoStudent("John", 35, 11113, 1, 32,10);
        System.out.println(student3);
        student3.printProgLanguage();
        student3.attendClass();
    }
}
