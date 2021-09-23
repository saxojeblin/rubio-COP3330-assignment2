/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex28;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        int total = findTotal(input);

        System.out.printf("The total is %d.", total);
    }

    public static int findTotal(Scanner input) {

        int sum = 0, num;

        for (int i=0; i<5; i++) {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            sum += num;
        }

        return sum;
    }


}