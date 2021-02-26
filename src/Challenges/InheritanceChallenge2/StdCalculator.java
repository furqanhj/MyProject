package Challenges.InheritanceChallenge2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StdCalculator extends Calculator {

    public StdCalculator() {
        super("Standard");
    }

    public void AdditionMethod() {
        double input = 0;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("***Here we are ADDING different numbers***");
        System.out.print("Please enter a number: ");
        input = stdIn.nextDouble();

        if (input <= 0) {
            System.out.println("Please enter a valid number: ");
            input = stdIn.nextDouble();
        } else if (stdIn.hasNextDouble()){
            System.out.println("Please enter another number or press \"ENTER\": ");
            input += stdIn.nextDouble();
        }
        System.out.println("The total after ADDING all numbers is:\n" + input);
    }

    public void SubtractionMethod() {
        double input = 0;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("***Here we are SUBTRACTING different numbers***");
        System.out.print("Please enter a number: ");

        while (stdIn.hasNext()) {
            input -= stdIn.nextDouble();
            System.out.print("Please enter another number or press \"ENTER\": ");
            if (input <= 0)
                break;
        }
        stdIn.close();
        System.out.println("Your subtraction total is: " + input);
    }

    public void MultiplicationMethod() {
        double input = 0;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("***Here we are MULTIPLYING different numbers***");
        System.out.print("Please enter a number: ");

        while (stdIn.hasNext()){
            input *= stdIn.nextDouble();
            System.out.print("Please enter another number or press \"ENTER\": ");
            if (input<=0)
                break;
        }
        stdIn.close();
        System.out.println("Your total after multiplying all numbers is:\n" + input);

    }

    public void DivisionMethod() {
        double input = 0;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("***Here we are DIVIDING different numbers***");
        System.out.print("Please enter a number: ");

        while (stdIn.hasNext()){
            input /= stdIn.nextDouble();
            System.out.print("Please enter another number or press \"ENTER\": ");
            if (input<=0)
                break;
        }
        stdIn.close();
        System.out.println("Your total after dividing all numbers is:\n" + input);
    }
}
