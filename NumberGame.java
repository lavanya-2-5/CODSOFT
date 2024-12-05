 import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        // Initialize random number generator
        Random rand = new Random();

        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize score variables
        int totalRounds = 0;
        int totalWins = 0;
        int totalAttempts = 0;

        // Game loop
        while (true) {
            // Initialize number of attempts for this round
            int numberOfAttempts = 0;

            // Generate a random number between 1 and 100
            int numberToGuess = rand.nextInt(100) + 1;

            // Display game instructions
            System.out.println("Guess a number between 1 and 100.");
            System.out.println("You have 6 attempts to guess the number.");

            // Round loop
            while (numberOfAttempts < 6) {
                // Prompt user for guess
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                // Increment number of attempts
                numberOfAttempts++;
                totalAttempts++;

                // Check if user's guess is correct
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
                    totalWins++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }
            }

            // Check if user ran out of attempts
            if (numberOfAttempts == 6) {
                System.out.println("Sorry, you didn't guess the number. The correct answer was " + numberToGuess + ".");
            }

            // Increment total rounds
            totalRounds++;

            // Display score
            System.out.println("Score - Rounds: " + totalRounds + ", Wins: " + totalWins + ", Attempts: " + totalAttempts);

            // Ask user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            // Check if user wants to play again
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }

        // Close scanner
        scanner.close();
    }
}