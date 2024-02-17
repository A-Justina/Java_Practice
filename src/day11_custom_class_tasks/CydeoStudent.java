package day11_custom_class_tasks;

public class CydeoStudent {
    public String name;
    public int  age,
                id,
                grade,
                batchNumber,
                groupNumber;
    public static String schoolName;
    public static String programmingLanguage;

    public void study() {
        System.out.println(name + " is studying.");
    }
    public void attendClass(){
        System.out.println(name + " is attending the live class.");
    }
    public void printSchoolName() {
        System.out.println(name + " is student at Cydeo School");
    }
    public void printProgLanguage() {
        System.out.println("Speaks Java");
    }

    public CydeoStudent(String name, int age, int id, int grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
