import java.util.Random;
import java.util.Scanner;

public class  Exercise_03_Guess_The_Number {
    final private int numberToGuess;
    private int numberOfGuesses;

    public  Exercise_03_Guess_The_Number() {
        Random rand = new Random();
        numberToGuess = rand.nextInt(100) + 1;
        numberOfGuesses = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations, you guessed the number in " + numberOfGuesses + " tries!");
                break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Exercise_03_Guess_The_Number game = new  Exercise_03_Guess_The_Number();
        game.play();
    }
}
