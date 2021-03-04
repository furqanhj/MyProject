package Challenges;

import java.util.Scanner;

public class FizzChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of your choice: ");
        int number = scanner.nextInt();

        System.out.println(fizzBuzz(number));
    }

    public static String fizzBuzz(int num) {
        String word = String.valueOf(num);
        num = 0;

        if (num % 5 != 0 && num % 3 == 0)
            return word;
        else if (num %5 == 0 && num %3 == 0)
            word = "FIZZ-BUZZ";
        else if (num % 3 == 0)
            word = "FIZZ";
        else if (num % 5 == 0)
            word = "BUZZ";
        else
            return word;
        return word;
    }
}
//        for ((number % 5 == 0 && number %3 == 0) ? "FIZZ-BUZZ" : number %5 == 0 ? "FIZZ" : number %3 == 0 ? "BUZZ" : number);





