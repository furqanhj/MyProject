package Challenges;

import java.util.Scanner;

public class SamiMenuChallenge {

    public static void main(String[] args) {
        SamiMenuChallenge obj = new SamiMenuChallenge();

        double sum = 0;

        sum += obj.getItemPrice(obj.orderItems());

        System.out.println("YOUR TOTAL IS: " + sum);
    }

    public int orderItems() {
        Scanner stdin = new Scanner(System.in);
        SamiMenuChallenge obj = new SamiMenuChallenge();
        obj.printMenu();

        int menuChoice = 0;

        System.out.print("PLEASE SELECT A MENU ITEM: ");
        menuChoice = stdin.nextInt();

        while (menuChoice < 1 || menuChoice > 7) {
            obj.printMenu();
            System.out.print("\nINVALID CHOICE -- PLEASE CHOOSE A MENU ITEM: ");
            menuChoice = stdin.nextInt();
        }

        return menuChoice;
    }


    public double getItemPrice(int itemSelection) {
        double itemPrice = -1;

        if (itemSelection < 1 || itemSelection > 7) {
            return itemPrice;
        } else {

            switch (itemSelection) {
                case 1: case 7:
                    itemPrice = 4.99;
                    break;
                case 2:
                    itemPrice = 5.99;
                    break;
                case 3:
                    itemPrice = 6.99;
                    break;
                case 4:
                    itemPrice = 5.19;
                    break;
                case 5:
                    itemPrice = 8.99;
                    break;
                case 6:
                    itemPrice = 3.99;
                    break;
            }
        }
        return itemPrice;
    }

    public void printMenu() {
        System.out.println("***BOB'S BURGERS MENU***\n\t1 - Hamburger ($4.99)\n\t2 - Cheeseburger ($5.99)\n\t" +
                "3 - Double Cheeseburger ($6.99)\n\t4 - Chicken Wrap ($5.19)\n\t5 - Chicken Wings ($8.99)" +
                "\n\t6 - Fries ($3.99)\n\t7 - Milkshake ($4.99)");
    }


}
