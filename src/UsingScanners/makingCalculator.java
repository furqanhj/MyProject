package UsingScanners;

import java.util.Scanner;

public class makingCalculator {
    static double num1;
    static double num2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.println("By adding both your numbers, the answer is: " + doAddition());
        System.out.println("By subtracting both your numbers, the answer is: " + doSubtraction());
        System.out.println("By multiplying both your numbers, the answer is: " + doMultiplication());
        System.out.println("By dividing both your numbers, the answer is: " + doDivision());

        scanner.close();
    }

    public static double doAddition(){

        return num1 + num2;
    }

    public static double doSubtraction(){

        return num1 - num2;
    }

    public static double doMultiplication(){

        return num1 * num2;
    }

    public static double doDivision(){
        return num1 / num2;
    }

}
