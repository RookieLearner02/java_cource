package chapter4;

import java.util.Scanner;
/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for a week. Do not allow overtime
 */
public class GrossPayInputValidation {
    public static void main(String[] args) {
        
        // Initialize known variables
        int employeeRatePerHour = 15;
        int maximumWorkingHoursPerWeek = 40;

        // Get input for unknown variables
        System.out.println("How many hours did you work this week? ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorkedPerWeek = scanner.nextDouble();

        // Validate input
        while (hoursWorkedPerWeek > maximumWorkingHoursPerWeek) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorkedPerWeek = scanner.nextDouble();
        }
        scanner.close();

        // Calculate the gross
        double grossSalaryPerWeek = hoursWorkedPerWeek * employeeRatePerHour;
        System.out.println("Gross weekly payout is: $" + grossSalaryPerWeek);
    }

}
