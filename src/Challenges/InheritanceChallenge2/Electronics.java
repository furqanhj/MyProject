package Challenges.InheritanceChallenge2;

//This is the super(parent) class.
public class Electronics {

    String typeOfElectronic;

    public Electronics(String typeOfElectronic) {
        this.typeOfElectronic = typeOfElectronic;
    }

    public void switchOn (){
        System.out.println("System starting...");
    }

    public void switchOff() {
        System.out.println("System shutting down...");
    }


}
