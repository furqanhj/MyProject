package Challenges.InheritanceChallenge2;

public class TestInheritance {

    public static void main(String[] args) {

        Calculator calObj = new Calculator("Standard");
        StdCalculator test = new StdCalculator();

        calObj.switchOn();
        test.AdditionMethod();
        test.SubtractionMethod();
        test.MultiplicationMethod();
        test.DivisionMethod();
        calObj.switchOff();

    }
}
