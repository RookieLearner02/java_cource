package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
//        Get the test score

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your test score: ");
        double scoreInNumber = scanner.nextDouble();
        scanner.close();

//        Determine the letter grades
        char gradeInLetter;

        if (scoreInNumber < 60){
            gradeInLetter = 'F';
        } else if (scoreInNumber < 70) {
            gradeInLetter = 'D';
        } else if (scoreInNumber < 80) {
            gradeInLetter = 'C';
        } else if (scoreInNumber < 90) {
            gradeInLetter = 'B';
        }else {
            gradeInLetter = 'A';
        }

//        output
        System.out.println("Your Grade is " + gradeInLetter);
    }
}
