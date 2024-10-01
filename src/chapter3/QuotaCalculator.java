package chapter3;

import java.util.Scanner;

/*
IF ELSE
    All salesperson are expected to make at least 10 sales each week
    For those who do, they receive a congratulatory message
    For those who doesn't, they are informed of how many sales they were short
 */
public class QuotaCalculator {
    public static void main(String[] args) {

//        Initialize values we know

        int minQuotaToReach = 10;

//        Get unknown values

        System.out.println("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int salesMadeInThisWeek = scanner.nextInt();
        scanner.close();

//        Make a decision on the path to take - output

        if(salesMadeInThisWeek >=  minQuotaToReach) {
            System.out.println("Congrats! You've met your quota");
        }
        else {
            int numberOfSalesShort = minQuotaToReach - salesMadeInThisWeek;
            System.out.println("You did not make your quota. You are " + numberOfSalesShort + " sales short");
        }
    }
}
