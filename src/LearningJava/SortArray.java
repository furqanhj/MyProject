package LearningJava;

public class SortArray {

    public static void main(String[] args) {

        int[] nums = {94, 93, -32, 17, 41, 42, 0, 81, -7, 10};
        int[] sortedArrays = sortNumbers(nums);

        for (int x : sortedArrays){
            System.out.println(x + "\t");
        }
    }

    public static int[] sortNumbers(int[] array) {

        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
