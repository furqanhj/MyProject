package Challenges.InheritanceChallenge2;

public class Computer extends Electronics {

    String typeOfComputer;
    String brandName;
    float screenSize;
    int memorySize;
    String operatingSystem;

    public Computer(String typeOfElectronic, String typeOfComputer, String brandName, float screenSize, int memorySize, String operatingSystem) {
        super(typeOfElectronic);
        this.typeOfComputer = typeOfComputer;
        this.brandName = brandName;
        this.screenSize = screenSize;
        this.memorySize = memorySize;
        this.operatingSystem = operatingSystem;
    }

    public void login (){
        System.out.println("Logging in..");
    }

    public void logout(){
        System.out.println("Logged out of system");
    }



}
