/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex36;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        ArrayList<Double> numList = new ArrayList<>();

        getNumbers(numList);

        double average = findAverage(numList);
        double min = findMin(numList);
        double max = findMax(numList);

        double SD = findSD(numList, average);

        printResults(numList, average, min, max, SD);

    }

    public static void getNumbers(ArrayList<Double> numList) {
        Scanner input = new Scanner(System.in);
        String check = "blank";
        double newNum;

        while(!check.equals("done")) {
            System.out.print("Enter a number: ");
            check = input.nextLine();

            if(!check.equals("done")) {
                if(Pattern.matches("[0-9]+", check)) {
                    newNum = Double.parseDouble(check);
                    numList.add(newNum);
                }
                else {
                    System.out.print("You did not enter a valid number.\n");
                }
            }
        }
    }

    public static double findAverage(ArrayList<Double> numList) {

        double total=0, ave;

        for (double num : numList) {
            total += num;
        }

        ave = total / numList.size();
        return ave;
    }

    public static double findMin(ArrayList<Double> numList) {
        double min = numList.get(0);
        for (int i=1; i<numList.size(); i++) {
            if(numList.get(i) < min) {
                min = numList.get(i);
            }
        }
        return min;
    }

    public static double findMax(ArrayList<Double> numList) {

        double max = numList.get(0);
        for (int i=1; i<numList.size(); i++) {
            if(numList.get(i) > max) {
                max = numList.get(i);
            }
        }
        return max;
    }

    public static double findSD(ArrayList<Double> numList, double ave) {

        double SD = 0;

        for (double num : numList) {
            SD += Math.pow(num - ave, 2);
        }
        return Math.sqrt(SD/ numList.size());

    }

    public static void printResults(ArrayList<Double> numList, double ave, double min, double max, double SD) {

        System.out.print("Numbers: ");

        for (double num : numList) {
            System.out.printf("%.0f, ", num);
        }

        System.out.println("\nThe average is " + ave);
        System.out.printf("The minimum is %.0f", min);
        System.out.printf("\nThe maximum is %.0f", max);
        System.out.printf("\nThe standard deviation is %.2f", SD);
    }
}
