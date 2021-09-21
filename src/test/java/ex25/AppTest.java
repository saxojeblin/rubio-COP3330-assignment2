
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex25;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.regex.Pattern;

public class AppTest
{
    @BeforeClass
    public static void beforeClass() {
        App app = new App();
    }

    @Test
    public void testFindWeakerPassword() {

        assertTrue(Pattern.matches("[0-9]+" , "12345"));
        assertTrue(Pattern.matches("[a-zA-Z]+" ,"abcdef"));

    }

    @Test
    public void testFindStrongerPassword() {

        assertEquals(3,  App.findStrongerPassword("abc123xyz"));
        assertEquals(4, App.findStrongerPassword("1337h@xor!"));

    }
}