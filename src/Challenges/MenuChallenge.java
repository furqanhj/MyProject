package Challenges;

import java.util.Scanner;

public class MenuChallenge {
    static String food;
    static byte quantity;

    public static void main(String[] args) {

        System.out.println("\t\t\t\t\t\t\t ******MENU****** \n BEEF BURGER \t\t\t CHICKEN BURGER \t\t\t BEEF BIRYANI \t\t\t CHICKEN BIRYANI \t\t\t CHICKEN TIKKA \t\t\t BEEF BOTI \n" +
                "BUTTER CHICKEN \t\t\t CHICKEN 65 \t\t\t VEGETABLE CURRY \t\t\t FISH MASALA \t\t\t DESSERT \t\t\t TEA");
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("What do you prefer to eat: ");
            food = scanner.nextLine();
            System.out.print("What quantity: ");
            quantity = scanner.nextByte();
            continue;
        }
        while (food.equals("End"));
    }
}
