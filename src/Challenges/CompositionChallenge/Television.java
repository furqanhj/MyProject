package Challenges.CompositionChallenge;

public class Television {

    private String manufacturer;
    private int screenSize;
    private boolean isLED;

    public Television(String manufacturer, int screenSize, boolean isLED) {
        this.manufacturer = "Samsung";
        this.screenSize = screenSize;
        this.isLED = isLED;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setLED(boolean LED) {
        isLED = LED;
    }

    public void tvMethod(){
        System.out.println("This " + getManufacturer() + "TV is " + screenSize + " inches.");
    }

    public void tvOn(){
        System.out.println(getManufacturer() + " TV is on.");
    }

    public void turnOff(){
        System.out.println(getManufacturer() + " TV is off.");
    }
}
