/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        getNames(names);

        int size = names.size();
        int winnerIndex = findRandomNum(size);

        printWinner(names, winnerIndex);

    }

    public static void getNames(ArrayList<String> names)  {
        Scanner input = new Scanner(System.in);
        String check = "blank";
        int count = 0;

        while(!check.equals("")) {
            System.out.print("Enter a name: ");
            check = input.nextLine();

            if(!check.equals("")) {
                names.add(check);
            }
        }
    }

    public static int findRandomNum(int size) {
        Random rand = new Random();
        return rand.nextInt(size);
    }

    public static void printWinner(ArrayList<String> names, int index) {
        System.out.println("The winner is... " + names.get(index) + "!");
    }

}