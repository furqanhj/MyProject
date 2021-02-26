package Challenges.InheritanceChallenge2;

public class Laptop extends Computer{

    String brandName;
    float screenSize;
    int memorySize;
    String operatingSystem;

    public Laptop(String typeOfComputer, String brandName, float screenSize, int memorySize, String operatingSystem) {
        super("Laptop");
        this.brandName = brandName;
        this.screenSize = screenSize;
        this.memorySize = memorySize;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void login() {
        super.login();
    }

    @Override
    public void logout() {
        super.logout();
    }

    @Override
    public void switchOn() {
        super.switchOn();
    }

    @Override
    public void switchOff() {
        super.switchOff();
    }

    public void welcomeScreen(){
        System.out.println("Welcome !");
    }

}


