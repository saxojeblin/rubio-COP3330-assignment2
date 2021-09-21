
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex26;

import static java.lang.Math.log;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
    @BeforeClass
    public static void beforeClass() {
        App app = new App();
    }

    @Test
    public void testCalculateMonthsUntilPaidOff() {

        int i = 12 / 100 / 365;
        //assertEquals(70, Math.round(-(1/30) * log(1 + 5000/100 * (1 - Math.pow((1 + i), 30)) / log(1 + i))));
        //assertEquaals();

    }

}