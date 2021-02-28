package Challenges.InheritanceChallenge2;

import java.util.Scanner;

public class StdCalculator extends Calculator {

    public StdCalculator() {
        super("Standard");
    }

    public void AdditionMethod() {
        double sum = 0;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("***Here we are ADDING different numbers***");
        System.out.print("Please enter a number: ");
        double input = stdIn.nextDouble();

        while (input > 0) {
            sum += input;
            System.out.print("Please enter another number or press \"0\": ");
            input = stdIn.nextDouble();

        }
        System.out.println("THE CURRENT TOTAL IS: " + sum);
        System.out.println(" ");
    }

    public void SubtractionMethod() {
        double sum = 0;
        double input;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("***Here we are SUBTRACTING different numbers***");
        System.out.print("Please enter a number: ");
        input = stdIn.nextDouble();
        sum = input;

        do {
            System.out.print("Please enter another number or press \"0\": ");
            input = stdIn.nextDouble();
            sum -= input;
        } while (input > 0);

        System.out.println("THE CURRENT TOTAL IS: " + (sum));
        System.out.println(" ");
    }

    public void MultiplicationMethod() {
        double sum = 0;
        double input;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("***Here we are MULTIPLYING different numbers***");
        System.out.print("Please enter a number: ");
        input = stdIn.nextDouble();
        sum = input;

        do {
            System.out.print("Please enter another number or press \"0\": ");
            input = stdIn.nextDouble();
            sum = sum * input;
        } while (input <= 0);

        System.out.println("THE CURRENT TOTAL IS: " + sum);
        System.out.println(" ");
    }

    public void DivisionMethod() {
        double sum = 0;
        double input;
        Scanner stdIn = new Scanner(System.in);
        System.out.println("***Here we are DIVIDING different numbers***");
        System.out.print("Please enter a number: ");
        input = stdIn.nextDouble();
        sum = input;

        do {
            System.out.print("Please enter another number or press \"0\": ");
            input = stdIn.nextDouble();
            sum /= input;
        } while (input > 0);

        System.out.println("THE CURRENT TOTAL IS: " + sum);
        System.out.println(" ");
        stdIn.close();
    }

}
