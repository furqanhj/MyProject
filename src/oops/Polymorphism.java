package oops;

import java.net.PortUnreachableException;

public class Polymorphism {

/*
Polymorphism is the ability to have multiple methods with the same name / same functionality,
but acting on different objects / variables.

2 types of polymorphism:
        1- Method Overloading (Compile-Time Polymorphism)
        2- Method Overriding (Run-time Polymorphism)
    TIP:
        Only way you can differentiate overloaded methods are:
        a) Number of parameters
        b) Types of parameters
        c) Order of parameters

        NOTE: RETURN TYPE DOES NOT MATTER.
 */
        public static void main(String[] args) {
            printName();
            printName("Muhammad", 11);
            printName("Moosa", "Furqan", 5);

}

    public static void printName(){
        System.out.println("Furqan Javed is the father of programming");
    }

    public static void printName(String firstName, int age){
        System.out.println(firstName + " Furqan" + " is " + age + " years old");
    }

    public static void printName(String firstName, String lastName, int age) {
        System.out.println(firstName + " " + lastName + " is " + age + " years old.");
    }
}
