package Challenges;

public class AlexControlFlowChallenge {
    public static void main(String[] args) {

        evenNumberSort();
        oddNumberSort();
        evenOrOddSort();

    }

    public static void oddNumberSort() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println("This number is odd " + i);
            }
        }
    }

    public static void evenNumberSort() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("This is even number " + i);
            }
        }

    }
    public static void evenOrOddSort(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("This is even number " + i);
            }else{
                System.out.println("This number is odd " + i);
            }
        }
    }

}
