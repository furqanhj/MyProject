package UsingScanners;

import java.util.Scanner;

/**
 * This is just a test project to practice my commenting.
 * Here I am practicing Documentation Commenting.
 * This same module is already done in WDE_Core_Java_2021 Project.
 * @author Furqan
 * @since 02/23/2021
 * @hidden FJ
 */
public class project1 {

    // This is a test for single-line commenting.

    static String firstName;
    static String lastName;
    static int age;

/*
This is an example of a mutli-line commenting. this way whatever are between these forward slashes
will all be just comments.
No matter how many times we press enter button, it will still remain as comments
 */

    static String printName (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        lastName = scanner.nextLine();

        System.out.println("Enter your age");
        String ageInWords = String.valueOf(age);
        ageInWords = scanner.nextLine();

        return firstName + " " + lastName + " " + ageInWords + " years old.";

    }

    public static void main(String[] args) {

        System.out.println("So your name is: " + printName());

    }
}
