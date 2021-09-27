/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex36;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import org.testng.annotations.BeforeClass;

import java.util.ArrayList;

public class AppTest {

    @BeforeClass
    public static void beforeClass() {
        App app = new App();
    }

    @Test
    public void testFindAverage() {
        ArrayList<Double> list = new ArrayList<>();
        list.add(100.0);
        list.add(200.0);
        list.add(1000.0);
        list.add(300.0);

        assertEquals(400, App.findAverage(list));
    }

    @Test
    public void testFindMin() {
        ArrayList<Double> list = new ArrayList<>();
        list.add(100.0);
        list.add(200.0);
        list.add(1000.0);
        list.add(300.0);

        assertEquals(100, App.findMin(list));
    }

    @Test
    public void testFindMax() {
        ArrayList<Double> list = new ArrayList<>();
        list.add(100.0);
        list.add(200.0);
        list.add(1000.0);
        list.add(300.0);

        assertEquals(1000, App.findMax(list));
    }

    @Test
    public void testSD() {
        ArrayList<Double> list = new ArrayList<>();
        list.add(100.0);
        list.add(200.0);
        list.add(1000.0);
        list.add(300.0);
        double ave = 400.0;

        assertEquals(354, Math.round(App.findSD(list, ave)));
    }



}