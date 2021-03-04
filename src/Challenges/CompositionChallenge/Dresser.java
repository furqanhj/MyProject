package Challenges.CompositionChallenge;

public class Dresser {

    private int numOfDrawers;
    private boolean isEmpty;

    public Dresser(int numOfDrawers, boolean isEmpty) {
        this.numOfDrawers = numOfDrawers;
        this.isEmpty = isEmpty;
    }

    public int getNumOfDrawers() {
        return numOfDrawers;
    }

    public void setNumOfDrawers(int numOfDrawers) {
        this.numOfDrawers = numOfDrawers;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public boolean setEmpty(int numOfClothes) {
        numOfClothes = 0;
        boolean empty = false;
        if(numOfClothes > 0 )
            empty = true;
        else
            empty = false;
        return empty;
    }

    public void openDrawer(){
        System.out.println("Drawer is open and has " + setEmpty(20));
    }
}
