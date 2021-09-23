/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex29;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        int r, y;

        r = getValidInput(input);
        y = findInvestmentTime(r);

        System.out.printf("It will take you %d years to double your inital investment.", y);
    }

    public static int getValidInput (Scanner input) {

        int r=0;
        boolean check;

        do {
            System.out.print("What is the rate of the return? ");

            if(input.hasNextInt()) {
                r = input.nextInt();

                if (r != 0) {
                    check = true;
                }
                else {
                    System.out.println("Sorry. '0' is not a valid input.");
                    check = false;
                }
            }
            else {
                System.out.println("Sorry. That's not a valid input.");
                check = false;
                input.next();
            }
        } while (!check) ;

        return r;
    }

    public static int findInvestmentTime(int r) {
        int years;
        years = 72 / r;
        return years;
    }
}