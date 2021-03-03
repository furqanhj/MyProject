package LearningJava;

import java.util.Locale;

public class TodaysChallenge {

    public static void main(String[] args) {
        countVowels("Mother");
    }

    public static void countVowels(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.toLowerCase().charAt(i) == 'a' || word.toLowerCase().charAt(i) == 'e' ||
                    word.toLowerCase().charAt(i) == 'o' || word.toLowerCase().charAt(i) == 'u'
                    || word.toLowerCase().charAt(i) == 'i') {
                count++;
            }
        }
        System.out.println("Total number of vowels in string are: " + count);
    }
}
