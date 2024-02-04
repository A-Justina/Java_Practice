package day04_selection_statements_tasks;

public class Age {
    public static void main(String[] args) {

        int age = 150;

        String result = "";

        if(age>=0&&age<=150){
            if(age<=20){
                result = "Teenager";
            } else if (age<=55) {
                result = "Adult";
            }else {
                result = "Senior";
            }
        }else {
            result = "Invalid";
        }
        System.out.println(result);
    }
}

