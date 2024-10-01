package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {

//        Get the letter grade from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter grade: ");
        String letterGrade = scanner.next();
        scanner.close();

//      Messages for grade
        String gradeMessage = switch (letterGrade) {
            case "A" -> "Excellent Job!";
            case "B" -> "Great Job!";
            case "C" -> "Good Job!";
            case "D" -> "You Need to work a bit harder";
            case "F" -> "Uh Oh!";
            default -> "Error. Invalid grade.";
        };
//        Output
        System.out.println(gradeMessage);

    }
}
