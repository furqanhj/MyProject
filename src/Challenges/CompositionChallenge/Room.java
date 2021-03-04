package Challenges.CompositionChallenge;

public class Room {

    String whoseRoom;
    Lamp lamp;
    Television television;
    Aircondition aircondition;
    Dresser dresser;
    Door door;

    public Room(String whoseRoom, Lamp lamp, Television television, Aircondition aircondition, Dresser dresser, Door door) {
        this.whoseRoom = whoseRoom;
        this.lamp = lamp;
        this.television = television;
        this.aircondition = aircondition;
        this.dresser = dresser;
        this.door = door;
    }
}
