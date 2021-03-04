package Challenges.CompositionChallenge;

public class Aircondition {

    private String manufacturer;
    private int tons;
    private boolean hasRemote;
    private int temperature;

    public Aircondition(String manufacturer, int tons, boolean hasRemote, int temperature) {
        this.manufacturer = manufacturer;
        this.tons = tons;
        this.hasRemote = hasRemote;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getTons() {
        return tons;
    }

    public void setTons(int tons) {
        this.tons = tons;
    }

    public boolean isHasRemote() {
        return hasRemote;
    }

    public void setHasRemote(boolean hasRemote) {
        this.hasRemote = hasRemote;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("The AC is set to " + temperature + " degrees");
    }


}
