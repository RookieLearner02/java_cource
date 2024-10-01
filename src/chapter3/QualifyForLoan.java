package chapter3;

import java.util.Scanner;

/*
Nested IF
    To Qualify for a loan,
        Person must make at least $30,000
        and
        Have been working at their current job for at least 2 years
 */
public class QualifyForLoan {
    public static void main(String[] args) {
        
//    Initialize the value we know

        int minimumSalaryRequirement = 30000;
        int minimumWorkingYears = 2;

//    Ask the value we don't know

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current monthly salary: ");
        double currentSalaryPerMonth = scanner.nextDouble();

//    Check the condition and give output

        if (currentSalaryPerMonth >= minimumSalaryRequirement){
            System.out.println("Enter current working experience in you company: ");
            double currentWorkingExperience = scanner.nextDouble();
            scanner.close();
            if (currentWorkingExperience >= minimumWorkingYears){
                System.out.println("Congrats! you are qualified for a loan.");
            }
            else {
                System.out.println("Sorry! You are not qualified for a loan, as your current working experience (" + currentWorkingExperience +
                        ") is less than minimum work experience (" + minimumWorkingYears + ").");
            }
        }
        else {
            System.out.println("Sorry! you are not qualified for a loan , as your current salary (" + currentSalaryPerMonth + ") is less than minimum salary ("
                    + minimumSalaryRequirement + ") requirement.");
        }
    }
}
