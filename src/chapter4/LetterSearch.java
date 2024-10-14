package chapter4;

import java.util.Scanner;

/*
LOOP Break
Search a String to determine if it contains the letter 'A'
 */
public class LetterSearch {
    public static void main(String[] args) {

//        Get Text
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String userEnteredText = scanner.next();
        scanner.close();

        boolean letterFound = false;

//      Search text for letter 'A'
        for (int i = 0; i < userEnteredText.length(); i++) {
            char currentLetter = userEnteredText.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("This text contains letter A");
        }
        else {
            System.out.println("This text doesn't contain letter A");
        }
    }
}
