package Challenges.InheritanceChallenge3;

import Challenges.InheritanceChallenge2.Calculator;

public class TestCarpetCalculator {

    public static void main(String[] args) {

        Floor floor = new Floor(25.20, 20.11);
        Carpet carpet = new Carpet(25.75);

        CostCalculator calc = new CostCalculator(floor, carpet);

        System.out.println("The total cost will be: $" + calc.getTotalCost());
    }
}
