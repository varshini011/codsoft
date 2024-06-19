import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        char playAgain;
        int attempts = 0;
        int rounds = 0;
        int totalAttempts = 0;
        int score = 0;

        do {
            int randomNumber = rand.nextInt(100) + 1;
            attempts = 0;
            rounds++;

            System.out.println("Round " + rounds + ":");
            System.out.println("Guess the number between 1 and 100.");

            int guess;
            do {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score += (100 - (attempts * 10)); // Calculating score based on attempts
                    totalAttempts += attempts;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            } while (true);

            System.out.println("Attempts taken: " + attempts);
            System.out.println("Your current score: " + score);

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);
        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thanks for playing!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Total attempts made: " + totalAttempts);
        System.out.println("Your final score: " + score);

        sc.close();
    }
}

