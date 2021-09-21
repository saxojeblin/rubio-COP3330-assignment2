
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex26;

import static java.lang.Math.log;

public class PaymentCalculator {

    private double b, i, p;

    public PaymentCalculator(double balance, double apr, double payment) {
        this.b = balance;
        this.i = apr /100/365;
        this.p = payment;
    }

    public double calculateMonthsUntilPaidOff() {

        double months = -(1/30) * log(1 + this.b/this.p * (1 - Math.pow((1 + i), 30))) / log(1 + i);
        return months;
    }
}
