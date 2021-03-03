package LearningJava;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println( );
    }

    public static boolean isPalindrome (String text){
        char[] textArray = text.toCharArray();
        char[] reverseArray = new char[textArray.length];
        boolean flag = false;

        for (int i = textArray.length-1; i >=0 ; i--) {
            reverseArray[(textArray.length-1)-i] = textArray[i];
            if (textArray[i] != reverseArray[i]){
                flag = false;
            } else
                flag = true;
        }
        return flag;
    }


}
