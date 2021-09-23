/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex28;
import java.util.Scanner;

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
    public void testFindTotal() {

        int num, sum=0;

        for (int i=0; i<5; i++) {
            num = i+1;
            sum += num;
        }

        Assert.assertEquals(15, sum);
    }

}