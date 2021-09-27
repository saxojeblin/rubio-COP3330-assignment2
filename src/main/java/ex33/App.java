/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex33;

import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        askQuestion();

        String[] answers = new String[4];
        answers[0] = "Yes.";
        answers[1] = "No.";
        answers[2] = "Maybe.";
        answers[3] = "Ask again later.";

        int random = findRandomNum();

        System.out.println("\n" + answers[random]);

    }

    public static void askQuestion() {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your question?\n> ");
        input.nextLine();
    }

    public static int findRandomNum() {
        Random rand = new Random();
        return rand.nextInt(4);
    }

}