package LearningJava;

import java.util.Scanner;

public class sameChallengeByMe {

    public static void main(String[] args) {
       Scanner stdin = new Scanner(System.in);
       System.out.println("Please enter something...");
       String input = stdin.nextLine();
       int counted = vowelsCounted(input);
        System.out.println("The number of vowels in your sentence are: " + counted);
    }

    public static int vowelsCounted(String text) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] textArray = text.toLowerCase().toCharArray();
        int count = 0;

        // Using For-each loop.
        for (char v : vowels)
            for (char t : textArray)
                if (v == t)
                    count++;
        return count;
    }
}

