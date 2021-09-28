/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex38;

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
    public void testConvertNumberList() {
        String numbers = "1 2 3 4 5 6 7 8";
        char[] justNumbers = new char[8];
        justNumbers[0] = '1';
        justNumbers[1] = '2';
        justNumbers[2] = '3';
        justNumbers[3] = '4';
        justNumbers[4] = '5';
        justNumbers[5] = '6';
        justNumbers[6] = '7';
        justNumbers[7] = '8';

        assertEquals(justNumbers[0], App.convertNumberList(numbers)[0]);
        assertEquals(justNumbers[1], App.convertNumberList(numbers)[1]);
        assertEquals(justNumbers[2], App.convertNumberList(numbers)[2]);
        assertEquals(justNumbers[3], App.convertNumberList(numbers)[3]);
        assertEquals(justNumbers[4], App.convertNumberList(numbers)[4]);
        assertEquals(justNumbers[5], App.convertNumberList(numbers)[5]);
        assertEquals(justNumbers[6], App.convertNumberList(numbers)[6]);
        assertEquals(justNumbers[7], App.convertNumberList(numbers)[7]);
    }

    @Test
    public void testFilterEvenNumbers() {
        char[] numbers = new char[8];
        numbers[0] = '1';
        numbers[1] = '2';
        numbers[2] = '3';
        numbers[3] = '4';
        numbers[4] = '5';
        numbers[5] = '6';
        numbers[6] = '7';
        numbers[7] = '8';

        int[] evenNumbers = new int[4];
        evenNumbers[0] = 2;
        evenNumbers[1] = 4;
        evenNumbers[2] = 6;
        evenNumbers[3] = 8;

        assertEquals(evenNumbers[0], App.filterEvenNumbers(numbers)[0]);
        assertEquals(evenNumbers[1], App.filterEvenNumbers(numbers)[1]);
        assertEquals(evenNumbers[2], App.filterEvenNumbers(numbers)[2]);
        assertEquals(evenNumbers[3], App.filterEvenNumbers(numbers)[3]);
    }

}