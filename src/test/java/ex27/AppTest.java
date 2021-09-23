/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex27;

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
    public void testValidateFirstName() {

        Assert.assertEquals(1, App.validateFirstName("J"));
        Assert.assertEquals(2, App.validateFirstName(""));
        Assert.assertEquals(0, App.validateFirstName("John"));

    }

    @Test
    public void testValidateLastName() {
        Assert.assertEquals(1, App.validateLastName("H"));
        Assert.assertEquals(2, App.validateLastName(""));
        Assert.assertEquals(0, App.validateLastName("Johnson"));
    }

    @Test
    public void testValidateZip() {
        Assert.assertEquals(1, App.validateZip("ABCDE"));
        Assert.assertEquals(1, App.validateZip("ABC12"));
        Assert.assertEquals(0, App.validateZip("12345"));
    }

    @Test
    public void testValidateID() {
        Assert.assertEquals(1, App.validateID("AA1-2342"));
        Assert.assertEquals(1, App.validateID("1A-324A"));
        Assert.assertEquals(0, App.validateID("TK-1234"));
    }
}