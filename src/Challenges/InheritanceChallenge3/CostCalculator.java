package Challenges.InheritanceChallenge3;

import Challenges.InheritanceChallenge2.Calculator;

public class CostCalculator {

    Floor floor;
    Carpet carpet;

    public CostCalculator (Floor floor, Carpet carpet){
            this.carpet = carpet;
            this.floor = floor;
    }

    public double getTotalCost (){
        return floor.getArea() * carpet.getCost();
    }

}
