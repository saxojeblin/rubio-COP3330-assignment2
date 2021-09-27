/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex34;

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
    public void testRemoveEmployee() {
        // expected result array
        String[] afterRemoval = new String[5];
        afterRemoval[0] = "John Smith";
        afterRemoval[1] = "Jackie Jackson";
        afterRemoval[2] = "Amanda Cullen";
        afterRemoval[3] = "Jeremy Goodwin";
        afterRemoval[4] = "Jeremy Goodwin";

        // generate employee array and remove element chris jones
        String[] employees = new String[5];
        App.createEmployeeArray(employees);
        App.removeEmployee(employees, "Chris Jones");

        assertEquals(afterRemoval[0], employees[0]);
        assertEquals(afterRemoval[1], employees[1]);
        assertEquals(afterRemoval[2], employees[2]);
        assertEquals(afterRemoval[3], employees[3]);
        assertEquals(afterRemoval[4], employees[4]);
    }

}