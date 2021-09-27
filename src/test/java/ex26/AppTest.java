
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import org.testng.annotations.BeforeClass;

public class AppTest {

    @BeforeClass
    public static void beforeClass() {
        App app = new App();
    }

    @Test
    public void testCalculateMonthsUntilPaidOff() {

        double i = 12;
        double b = 5000.0;
        double p = 100.0;
        PaymentCalculator creditData = new PaymentCalculator(b,i,p);

        assertEquals(70, Math.ceil(creditData.calculateMonthsUntilPaidOff()));
    }

}