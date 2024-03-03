package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;

        while (playAgain) 
        {
            int score = playGame(random, scanner);
            totalScore += score;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thank you for playing! Your total score is: " + totalScore);
        scanner.close();
    }

    private static int playGame(Random random, Scanner scanner) 
    {
        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 5;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + lowerBound + " and " + upperBound);

        while (attempts < maxAttempts) 
        {
            System.out.print("Enter your guess: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter your guess: ");
                scanner.next();
            }

            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                return attempts;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
        return 0;
    }
}
