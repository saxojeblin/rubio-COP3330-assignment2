
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex26;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        double b, i, payment, months;

        System.out.print("What is your balance? ");
        b = input.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        i = input.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        payment = input.nextDouble();

        PaymentCalculator creditData = new PaymentCalculator(b,i,payment);
        months = Math.ceil(creditData.calculateMonthsUntilPaidOff());

        System.out.printf("It will take you %.0f months to pay off this card.", months);
    }
}