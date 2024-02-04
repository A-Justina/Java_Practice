package day04_selection_statements_tasks;

public class ChooseLanguage {
    public static void main(String[] args) {

        int chooseLanguage = 3;

        if (chooseLanguage == 1) {
            System.out.println("Hello, thank you for your call");
        }else if (chooseLanguage == 2) {
            System.out.println("Hola, gracias por llamar");
        } else if (chooseLanguage == 3) {
            System.out.println("Merhaba, aradığınız için teşekkürler");
        } else if (chooseLanguage == 4) {
            System.out.println("Привет, спасибо за ваш звонок");
        }else if (chooseLanguage == 5) {
            System.out.println("Merci, pour votre appel");
        }else{
            System.out.println("We don't speak this language");
        }
    }
    }
/*
Create a class named ChooseLanguage. Given an integer variable named selection that has a
number between 1~5, write a program that selects the language based on the number provided in
the selection and prints the following message:

		for 1: Hello, thank you for your call
		for 2: Hola, gracias por llamar
		for 3: Merhaba, aradığınız için teşekkürler
		for 4: Привет, спасибо за ваш звонок
		for 5: Merci, pour votre appel

			Example:
				   selection = 3;

			Output:
				  Merhaba, aradiginiz icin tesekkurler
 */

