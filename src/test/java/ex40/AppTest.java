/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex40;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AppTest {

    @BeforeClass
    public static void beforeClass() {
        App app = new App();
    }

    @Test
    public void testFilterEmployeeList() {
        Map m1 = App.getFirstMap();
        Map m2 = App.getSecondMap();
        Map m3 = App.getThirdMap();
        Map m4 = App.getFourthMap();
        Map m5 = App.getFifthMap();
        Map m6 = App.getSixthMap();

        List<Map> employeeList = App.createEmployeeList(m1, m2, m3, m4, m5, m6);

        List<Map> expectedList = new ArrayList<Map>();
        expectedList.add(m4);
        expectedList.add(m5);

        assertEquals(expectedList , App.filterEmployeeList(employeeList, "Jac"));
    }



}