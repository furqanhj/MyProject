package Challenges.CompositionChallenge;

public class TestRoomClass {


    public static void main(String[] args) {

        Lamp lamp = new Lamp(2, true);
        Television television = new Television("Samsung", 55, true);
        Aircondition aircondition = new Aircondition("LG", 250, true, 75);
        Dresser dresser = new Dresser(4, true);
        Door door = new Door(false, 2);

        Room furqansRoom = new Room("Furqans", lamp, television, aircondition, dresser, door);

        furqansRoom.dresser.setEmpty(4);
        furqansRoom.television.tvMethod();
        furqansRoom.lamp.lampOn();
        furqansRoom.lamp.lampOff();
        furqansRoom.aircondition.setTemperature(75);


    }




}
