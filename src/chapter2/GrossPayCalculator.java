package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] arg){
//        1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hoursEmployeeWorked = scanner.nextInt();

//        2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double hourlyPatRate = scanner.nextDouble();
        scanner.close();

//        3. Multiply hours and pay rate
        double grossPay = hoursEmployeeWorked * hourlyPatRate;
//        4. Display result
        System.out.println("Gross Pay calculated for the employee is : " + grossPay);
    }
}
