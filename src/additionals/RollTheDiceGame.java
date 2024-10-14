package additionals;

import java.util.Random;

/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
    1. Roll the die for the user(Generate a Random number between 1 - 6) and advance the user that number
      of spaces on the game board.
    2. After each roll, tell the user which game space they are on and how many more spaces they have to go
      to win
    3. Repeat this 4 additional times for 5 rolls in total
    4. However, if the user gets to 20 before 5 rolls, end the game - they've won
    5. If they are greater than or less than 20 spaces exactly, they lose.
    6. Remember there are only 20 spaces on the board, so a message like "You advanced to space 22" is a bug.
 */
public class RollTheDiceGame {

    static Random random = new Random();
    public static int rolledDieValue(){
        return random.nextInt(6) + 1;
    }

    public static void main(String[] args) {

        int totalNumberOfSpaces = 20;
        int currentSpaceCovered = 0;


        for (int i = 0; i < 5; i++) {
            int rolledValue = RollTheDiceGame.rolledDieValue();
            System.out.println("You have rolled a "+ rolledValue);
            currentSpaceCovered = currentSpaceCovered + rolledValue;
            int remainingSpaces = totalNumberOfSpaces - currentSpaceCovered;
            System.out.println("You have covered, " + currentSpaceCovered + " spaces.");
            if(remainingSpaces == 0){
                System.out.println("Congrats! You have won the game");
                break;
            }
            else {
                if(remainingSpaces < 0){
                    System.out.println("Sorry! Better luck next time.");
                    break;
                }
                else {
                    System.out.println("You have " + remainingSpaces + " spaces to cover in next " +
                            (5 - (i + 1)) + " rolls");
                }
            }
        }

        if (currentSpaceCovered != 20){
            System.out.println("Sorry! Better luck next time.");
        }
    }
}
