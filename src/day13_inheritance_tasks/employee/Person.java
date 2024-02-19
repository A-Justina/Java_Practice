package day13_inheritance_tasks.employee;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }
    public void eat(){
        System.out.println(name + " is eating.");
    }
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()||name==null){
            System.err.println("Name can not be set to null or empty");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.err.println("Age can not be set to zero or negative");
            System.exit(1);
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
/*
Create a class named "Person" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: String

   Encapsulation All the fields.
        Conditions:
            Name can not be set to null or empty
            Age can not be set to zero or negative

   Add a constructor to initialize all fields.

   Actions:
       - eat(): Displays the person's name with the message " is eating"
       - sleep(): Displays the person's name with the message " is sleeping"
       - toString(): Returns a string representation of the Person object.
 */