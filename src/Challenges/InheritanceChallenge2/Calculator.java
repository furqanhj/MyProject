package Challenges.InheritanceChallenge2;

public class Calculator extends Electronics{

    int number;
    String typeOfCalculator;

    public Calculator(String typeOfCalculator) {
        super("Calculator");
        this.number = 0;
        this.typeOfCalculator = typeOfCalculator;
    }

    @Override
    public void switchOn() {
        System.out.println(number);
    }

    @Override
    public void switchOff() {
        System.out.println("OFF");
    }
}
