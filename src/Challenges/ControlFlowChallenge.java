package Challenges;

public class ControlFlowChallenge {
// Write methods to print out even and odd numbers:

    public static void main(String[] args) {
        getEvenNumbers();
        getOddNumbers();

    }

    public static void getEvenNumbers() {
        System.out.println("The even numbers are as follows: ");
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void getOddNumbers() {
        System.out.println("\nThe odd numbers are as follows: ");
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ", ");
            }
        }
    }
}
  





