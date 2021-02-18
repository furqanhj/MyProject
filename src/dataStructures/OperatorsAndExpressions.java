package dataStructures;

public class OperatorsAndExpressions {

    /*
    Different types of Operators:
        1- Arithmetic Operator (performs calculations)
         eg: +,-, *, /
        2- Assignment Operator (used to assign values)
         eg: =, +=, -=,
        3- Comparison Operator (used to compare 2 or more values)
         eg: ==,
        4- LOGICAL OPERATORS:
         eg:

     */

    public static void main(String[] args) {


    //ASSIGNMENT OPERATORS:
        int x = 10;
        x += 1; // same as (x = x+1) {Also called Incrementing}

        x -= 1; // same as (x = x-1) {Also called Decrementing}

    // COMPARISON OPERATOR:
        int one = 10;
        int two = 10;
        System.out.println(one == two); // Equal to operator
        System.out.println(one != two); // Not Equal to operator
        System.out.println(one > two); // Greater than
        System.out.println(one < two); // Less than
        System.out.println(one >= two); // Greater than or equal to
        System.out.println(one <= two); // Less than or equal to
        // all of these comparison operators are used with Integers (numberical values)



        String firstName = "Furqan";
        String lastName = "Furqan";

        System.out.println(firstName.equals(lastName)); //To compare Strings we need to use .equals command


        // LOGICAL OPERATORS:
        int a = 10;
        int b = 15;
        int c = 19;
        int d = 10;

        /*
        Control flow Statements:
            1- Conditionals
            2- Loops
         */

        //Conditionals:
        if ((a == d) || (b < c)){
            System.out.println("First condition is printed");
        } else {
            System.out.println("Second condition is printed");
        }

    }
}
