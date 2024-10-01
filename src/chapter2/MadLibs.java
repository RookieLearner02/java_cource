package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1. Ask user to enter the season of the year
        System.out.println("Enter the Season of the year.");
        String seasonOfTheYear = scanner.next();
//        2. Ask user to enter the whole number
        System.out.println("Enter a whole number.");
        int wholeNumber = scanner.nextInt();
//        3. Ask user to enter the adjective
        System.out.println("Enter the adjective.");
        String adjective = scanner.next();
        scanner.close();
//        4. print the statement
        System.out.println("On a " + adjective + " " + seasonOfTheYear + " day , I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
