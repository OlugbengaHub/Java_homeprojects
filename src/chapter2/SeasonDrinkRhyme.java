package chapter2;

import java.util.Scanner;

public class SeasonDrinkRhyme {
    public static void main(String args[]){
        //Enter an Adjective to describe the season
        System.out.println("Enter your adjective:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        //Enter season of the year i.e. summer; winter; autumn or spring
        System.out.println("Enter season of the year:");
        String season = scanner.nextLine();

        //Enter a whole number
        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();
        scanner.close();

        //Display the result
        System.out.println("On a " + word + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
