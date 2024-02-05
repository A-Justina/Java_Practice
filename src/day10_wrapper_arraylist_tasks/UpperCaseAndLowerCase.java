package day10_wrapper_arraylist_tasks;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {

        String str = "JAVA java";
        int upperCount = 0,
            lowerCount = 0;

        for (int each: str.toCharArray()) {
            if (Character.isLetter(each)) {
                if (Character.isUpperCase(each)) {
                    upperCount++;
                } else {
                    lowerCount++;
                }
            }
        }
        System.out.println(upperCount==lowerCount);
    }
}
/*
Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.
	        Example:
	            str = "JAVA java";

	        output:
	            true
 */