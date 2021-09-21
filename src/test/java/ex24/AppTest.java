
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex24;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{
    @Test
    public void testCheck_Anagram() {
        App app = new App();
        assertTrue(App.check_anagram("note", "tone"));
        assertTrue(App.check_anagram("tar", "rat"));
        assertTrue(App.check_anagram("part", "trap"));
    }
}