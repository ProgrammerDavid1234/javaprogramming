import java.util.Scanner;
import java.util.Random;

public class GuessingGameShort {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != numberToGuess) {
            guess = scanner.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again:");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again:");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        scanner.close();
    }
}