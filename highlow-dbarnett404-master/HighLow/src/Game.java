import java.util.Scanner;

/**
 * Main class for Game - should contain all of the specific elements relating to the game class
 */
public class Game {
    /**
     * Prints out the initial range statement for the guessing game
     * @param range - maximum number for the game
     * @return the amount of turns the user will take to guess the number
     */
    private static int getNumGuesses(int range) {
        System.out.println("I'm thinking of number from 1 to " + range);
        System.out.println("How many guesses will it take you to guess the number?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * Asks the user what their specific guess is for the number
     * Has no error checking!
     * @return the number the selected
     */
    private static int getGuess() {
        System.out.println("What is your guess?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * Asks the user if they want to play again
     * @return true if they want to play again
     */
    private static boolean playAgain() {
        System.out.println("Do you want to play again y or n?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer.equalsIgnoreCase("y");
    }

    /**
     * Complete this method to handle the logic of the game
     * This code should contain the selection statement
     * @param numGuesses - how many guesses they think the code would take
     * @param hiddenNum - the number that the PC 'guessed'
     * @return - if they guess correctly
     */
    private static boolean playTurn(int numGuesses, int hiddenNum) {
        boolean correctGuess = false;
        //You just have to write the code to check if guess is equal to hiddenNum
        //If it's equal return true.
        int turnNo = 0;
        while (turnNo < numGuesses && !correctGuess) {
            //This lets the user input a number
            int guess = getGuess();
            if (guess == hiddenNum) {
                System.out.println("Correct!");
                correctGuess = true;
            } else if (guess < hiddenNum) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }
            turnNo++;
        }
        return correctGuess;
    }

    /**
     * Main game loop. Loops until they don't want to play any more
     * COuld be extended to have a score mechanism
     */
    public static void playGame() {
        boolean playing = true;
        int range = 20;
        while (playing) {
            int hiddenNum = Random.getRandInt(range);
            
            int numGuesses = getNumGuesses(range);
            playTurn(numGuesses, hiddenNum);
            playing = playAgain();
        }
    }
}
