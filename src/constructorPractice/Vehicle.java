package constructorPractice;

public class Vehicle {

    String vehicleType;
    String vehicleManufacturer;
    String vehicleModel;
    int numOfWheels;

    public Vehicle(String vehicleType){
        this.vehicleType = vehicleType;
        System.out.println("This is a " + vehicleType);
    }

    public Vehicle(String vehicleType, String vehicleManufacturer){
        this.vehicleType = vehicleType;
        this.vehicleManufacturer = vehicleManufacturer;
        System.out.println("This " + vehicleType + " is made by " + vehicleManufacturer);
    }

}
