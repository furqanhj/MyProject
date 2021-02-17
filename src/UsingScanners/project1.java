package UsingScanners;

import java.util.Scanner;

public class project1 {

    static String firstName;
    static String lastName;
    static int age;

    static String printName (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        lastName = scanner.nextLine();

        System.out.println("Enter your age");
        String ageInWords = String.valueOf(age);
        ageInWords = scanner.nextLine();

        return firstName + " " + lastName + " " + ageInWords;

    }

    public static void main(String[] args) {
        System.out.println("So your name and age is: " + printName());
    }
}
