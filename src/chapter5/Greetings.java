package chapter5;

import java.util.Scanner;

public class Greetings {

    static Scanner scanner = new Scanner(System.in);
    public static String greetUser(String userName){
        return "Hello, " + userName + ". How are you doing today? ";
    }

    public static void main(String[] args) {
        System.out.println("Please Let us know your good name?");
        String userEnteredName = scanner.next();
        scanner.close();
        System.out.println(greetUser(userEnteredName));
    }
}
