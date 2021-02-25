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

        while (true) {
            System.out.print("Enter a number: ");
            input = stdIn.nextDouble();
            input += input;

            if (input <= 0) {
                break;
            }
        }
        System.out.print("The total for the entered numbers is: " + input);
    }
}
