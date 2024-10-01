package chapter3;

import java.util.Scanner;

/*
IF statement
    All Salespeople get a payment of $1000 a week.
    Salespeople who exceed 10 sales get an additional bonus of $250
 */
public class SalaryCalculator {
    public static void main(String[] args) {
//        Initialize known values

        int salaryGivenForAllSalesperson = 1000;
        int bonusGivenForSalesperson = 250;
        int salesToExceedToPayTheBonus = 10;
//        Get values for the unknown

        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int salesMadeBySalesperson = scanner.nextInt();
        scanner.close();


//        Quick detour for the bonus earners

        if(salesMadeBySalesperson > salesToExceedToPayTheBonus){
            salaryGivenForAllSalesperson = bonusGivenForSalesperson + salaryGivenForAllSalesperson;
        }

//        Output
        System.out.println("The Employee's pay is $"+ salaryGivenForAllSalesperson);
    }
}
