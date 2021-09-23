/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex32;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        String game = "y";
        System.out.println("Let's play guess the number!");

        while (game.equals("y") || game.equals("Y")) {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            int diff, upperBound, random, guesses;

            System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
            diff = input.nextInt();

            upperBound = findUpperBound(diff);
            random = rand.nextInt(upperBound);

            guesses = playGame(random, input);

            System.out.printf("You got it in %d guesses! Do you wish to play again (Y/N)? ",guesses);
            game = input.next();
        }

    }

    public static int findUpperBound(int diff) {
        int upper = 0;

        if (diff == 1) {
            upper = 10;
        } else if (diff == 2) {
            upper = 100;
        } else if (diff == 3) {
            upper = 1000;
        }

        return upper;
    }

    public static int playGame(int random, Scanner input) {
        int numGuesses = 0;
        int guess;

        System.out.print("I have my number. What's your guess? ");
        guess = getGuess(input);
        numGuesses++;

        while (guess != random) {

            if (guess < random) {
                System.out.print("Too low. Guess again: ");
                guess = getGuess(input);
                numGuesses++;
            }
            else {
                System.out.print("Too high. Guess again: ");
                guess = getGuess(input);
                numGuesses++;
            }
        }

        return numGuesses;

    }

    public static int getGuess(Scanner input) {
        boolean check;
        int guess = 0;

        do {
            if (input.hasNextInt()) {
                guess = input.nextInt();
                check = true;
            } else {
                System.out.print("You did not enter a valid number. Try again\n");
                check = false;
                input.next();
            }
        } while (!(check));

        return guess;
    }


}