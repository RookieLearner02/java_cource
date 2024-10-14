package chapter4;

/*
*DO WHILE LOOP:
* Write a program that allows a user to enter two numbers
* and then sums up the two numbers. The user should be able to
* repeat this action until they indicate they are done.
*/

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean runAgain = false;
        do {
            System.out.println("Enter the first number:");
            double firstNumber = scanner.nextDouble();

            System.out.println("Enter the second number");
            double secondNumber = scanner.nextDouble();

            double sumOfTwoNumbers = firstNumber + secondNumber;

            System.out.println("The sum of two numbers you have entered is : " + sumOfTwoNumbers);

            System.out.println("Would you like to start over? (Y/N) : ");

            String userChoice = scanner.next();
            scanner.close();
            if(userChoice.equalsIgnoreCase("Y") || userChoice.equalsIgnoreCase("N")){
                if (userChoice.equalsIgnoreCase("Y")){
                    runAgain = true;
                }
                else {
                    runAgain = false;
                    System.out.println("Thanks! For using this program");
                }
            }
            else {
                System.out.println("Sorry! try again");
                break;
            }
        }while (runAgain);
    }
}
