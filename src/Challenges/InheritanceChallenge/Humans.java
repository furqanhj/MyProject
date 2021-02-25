package Challenges.InheritanceChallenge;

public class Humans extends LivingBeings {

    public Humans(String skinColor, int numOfHands, int numOfLegs, String typeOfHuman) {
        super(skinColor, "Human", numOfHands, numOfLegs);
    }

    String gender;
    int numOfEyes;
    String nationality;


    public void jumping() {
        System.out.println("Is jumping with joy... ");
    }

    public void crying() {
        System.out.println("Is crying ...");
    }

    public void frustrated() {
        System.out.println("Is learning JAVA :(...");
    }
}