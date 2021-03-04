package Challenges.CompositionChallenge;

public class Door {

    boolean isLocked;
    int numOfLocks;

    public Door(boolean isLocked, int numOfLocks) {
        this.isLocked = isLocked;
        this.numOfLocks = numOfLocks;
    }

    public void doorOpen(){
        System.out.println(" door is open");
    }

    public void doorClosed(){
        System.out.println(" door is closed");
    }

}
