package dataStructures;

public class LearnMultiDimensionalArrays {

    public static void main(String[] args) {

//        String[] names = {"Sami", "Furqan", "Alexandra", "Lamia", "Lamara", "Neila"};
//
//        for (String s : names)
//            System.out.println(s);

        // 2D Array                        // 6rows + 3columns
        String[][] studentInfo = new String[6][3];

        studentInfo[0][0] = "Sami";
        studentInfo[0][1] = "Sheikh";
        studentInfo[0][2] = "3449NY";

        studentInfo[1][0] = "Furqan";
        studentInfo[1][1] = "Javed";
        studentInfo[1][2] = "8449KS";

        studentInfo[2][0] = "ALexandra";
        studentInfo[2][1] = "Ederly";
        studentInfo[2][2] = "3465VA";

        studentInfo[3][0] = "Lamia";
        studentInfo[3][1] = "Bedjou";
        studentInfo[3][2] = "6543VA";

        studentInfo[4][0] = "Lamara";
        studentInfo[4][1] = "Benz";
        studentInfo[4][2] = "2254NY";

        studentInfo[5][0] = "Neila";
        studentInfo[5][1] = "Baileche";
        studentInfo[5][2] = "3254NY";

        for (String[] array : studentInfo) {
            for (String s : array) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
