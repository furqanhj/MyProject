package Challenges.InheritanceChallenge;

public class Man extends Humans {

    public Man(String skinColor, int numOfHands, int numOfLegs) {
        super(skinColor, numOfHands, numOfLegs, "Man");
    }

    String firstName;
    String lastName;
    int age;
    float height;


    public static void main(String[] args) {

        Man furqan = new Man("brown", 2, 2);
        furqan.age = 38;
        furqan.firstName = "Furqan";
        furqan.lastName = "Javed";

        System.out.println(furqan.firstName + furqan.lastName + " " + furqan.age );
        furqan.frustrated();
    }
}

