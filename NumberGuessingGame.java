import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int secretNumber = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } 
            else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } 
            else {
                System.out.println(" Correct! You guessed it in " + attempts + " attempts.");
                break;
            }
        }

        sc.close();
    }
}