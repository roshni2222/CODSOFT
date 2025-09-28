import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        System.out.println("🎮 Welcome to Number Guessing Game!");

        while (true) {
            int number = rand.nextInt(100) + 1; // 1 से 100 तक random number
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\nI have chosen a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed in " + attempts + " attempts.");
                    guessed = true;
                    score++;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessed) {
                System.out.println("❌ Out of attempts! The number was: " + number);
            }

            System.out.println("Your Score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String again = sc.next().toLowerCase();

            if (!again.equals("yes")) {
                System.out.println("Thanks for playing! Final Score: " + score);
                break;
            }
        }
        sc.close();
    }
}
