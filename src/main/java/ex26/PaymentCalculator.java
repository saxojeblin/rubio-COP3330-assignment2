
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
        this.i = apr/100.0/365.0;
        this.p = payment;
    }

    public double calculateMonthsUntilPaidOff() {

        double months = -(1.0/30.0) * log(1.0 + this.b / this.p * (1.0 - Math.pow((1.0 + this.i), 30.0))) / log(1.0 + this.i);
        return months;
    }
}
