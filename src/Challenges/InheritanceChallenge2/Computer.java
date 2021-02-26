package Challenges.InheritanceChallenge2;

public class Computer extends Electronics {

    String typeOfComputer;

    public Computer(String typeOfComputer) {
        super("Computer");
        this.typeOfComputer = typeOfComputer;

    }

    public void login (){
        System.out.println("Logging in..");
    }

    public void logout(){
        System.out.println("Logged out of system");
    }



}
