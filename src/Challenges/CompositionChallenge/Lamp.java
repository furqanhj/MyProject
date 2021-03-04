package Challenges.CompositionChallenge;

public class Lamp {

    private int numOfBulbs;
    private boolean isElectric;

    public Lamp(int numOfBulbs, boolean isElectric) {
        this.numOfBulbs = numOfBulbs;
        this.isElectric = isElectric;
    }

    public void lampOn(){
        System.out.println(numOfBulbs + " light bulbs have switched on");
    }

    public void lampOff(){
        System.out.println("Its dark in room.");
    }

}
