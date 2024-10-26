package chapter5;

/*
Variable scope
Write an 'instant credit check' program that approves
anyone who makes more than $25,000 and has a credit score
of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {
    static int minimumSalaryRequired = 25000;
    static int minimumCreditScoreRequired = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double userEnteredSalary = getUserSalary();
        int userEnteredCreditScore = getUserCreditScore();
        scanner.close();
//        Check if the user is qualified
        boolean userQualification = isUserQualified(userEnteredSalary, userEnteredCreditScore);
//        Notify the user
        notifyUser(userQualification);
    }
    public static double getUserSalary(){
        System.out.println("Enter Your Salary: ");
        return scanner.nextDouble();
    }
    public static int getUserCreditScore(){
        System.out.println("Enter your credit score: ");
        return scanner.nextInt();
    }
    public static boolean isUserQualified(double salary, int creditScore){
        return creditScore >= minimumCreditScoreRequired && salary >= minimumSalaryRequired;
    }
    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You are qualified.");
        }
        else {
            System.out.println("Sorry, You are not qualified");
        }
    }
}
