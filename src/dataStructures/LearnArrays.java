package dataStructures;

import java.util.Arrays;

public class LearnArrays {

    /*
    DATA STRUCTURE - How we organize/ store our data (collection of objects)
    */

    /*
               Index ALWAYS starts at 0.
       */

    public static void main(String[] args) {

        //Declare an Array (Method 1):
        String[] arrayOfNames;
        arrayOfNames = new String[4]; // we used new because Array is a non-primitive data type. [4] is the size of the array.

        // Initializing an Array (Method 1):
        arrayOfNames[0] = "Furqan";
        arrayOfNames[1] = "Saba";
        arrayOfNames[2] = "Muhammad";
        arrayOfNames[3] = "Moosa";

        // Declare an Array (Method 2):
        String[] arrayOfNames2 = new String[4];

        // Initializing an Arra y (Method 2):
        arrayOfNames2[0] = "Javed";
        arrayOfNames2[1] = "Munawar";
        arrayOfNames2[2] = "Faisal";
        arrayOfNames2[3] = "Fareeha";

        // Declaration and Initialization of Array (Method 3):
        String[] arrayOfNames3 = { "Zahid", "Kathleen", "Yafi", "Yasir" };

        System.out.println(Arrays.toString(arrayOfNames3));

    }
}
