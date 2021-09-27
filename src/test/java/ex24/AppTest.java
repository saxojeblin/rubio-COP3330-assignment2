
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest
{
    @Test
    public void testCheck_Anagram() {
        App app = new App();
        assertEquals(true, App.check_anagram("tone", "note"));
        assertEquals(true, App.check_anagram("rat" , "tar"));
        assertEquals(true, App.check_anagram("trap", "part"));
    }
}