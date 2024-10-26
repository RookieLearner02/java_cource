package additionals;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double chargeForEachMinute = 0.25;
    static double taxOnSubTotal = 0.15;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double inputtedPlanFee = operatorInputtedPlanFee();
        int inputtedOverageMinutes = operatorInputtedOverageMinutes();
        double overage = calculatedOverageFees(inputtedOverageMinutes);
        double tax = calculatedTax(inputtedPlanFee, overage);
        calculatedFinalTotal(inputtedPlanFee, overage, tax);
        scanner.close();
    }
    public static double operatorInputtedPlanFee(){
        System.out.println("Please enter the plan fee: ");
        return scanner.nextDouble();
    }
    public static int operatorInputtedOverageMinutes(){
        System.out.println("Please enter the overage minutes: ");
        return scanner.nextInt();
    }
    public static double calculatedTax(double basePlan, double overage){
        return (basePlan + overage)*taxOnSubTotal;
    }
    public static double calculatedOverageFees(int overageFees){
        return overageFees*chargeForEachMinute;
    }
    public static void calculatedFinalTotal(double basePlanCost, double overage, double tax){
        double finalCost = basePlanCost + overage + tax;
        System.out.println("Phone Bill Statement: \nPlan: $"+basePlanCost+"\nOverage: $"+overage+ "\n" +
                "Tax: $" +tax+"\nTotal: $"+finalCost);
    }
}
