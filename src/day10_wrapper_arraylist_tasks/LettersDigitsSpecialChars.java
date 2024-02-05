package day10_wrapper_arraylist_tasks;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        String letters = "";
        String digits = "";
        String specialChar = "";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)) {
                letters += each;
            } else if (Character.isDigit(each)) {
                digits += each;
            } else {
                specialChar += each;
            }
        }
        System.out.println("Letters = \"" + letters + "\"");
        System.out.println("Digits = " + digits);
        System.out.println("SpecialChars = \"" + specialChar + "\"");
    }
}
