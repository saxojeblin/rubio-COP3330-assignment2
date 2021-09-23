/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex31;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

    @BeforeClass
    public static void beforeClass() {
        App app = new App();
    }

    @Test
    public void testgetBPM() {
        assertEquals(138, Math.round(App.getBPM(22,65,55.0/100.0)));
        assertEquals(145, Math.round(App.getBPM(22,65,60.0/100.0)));
        assertEquals(151, Math.round(App.getBPM(22,65,65.0/100.0)));
    }




}