/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex31;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        int age, heartRate;

        age = findAge(input);
        heartRate = findHeartRate(input);

        printFormat(heartRate, age);
        outputResults(age, heartRate);
    }

    public static int findAge(Scanner input) {
        boolean check;
        int age = 0;

        do {
            System.out.print("Please enter your age: ");

            if (input.hasNextInt()) {
                age = input.nextInt();
                check = true;
            } else {
                System.out.print("You did not enter a valid age. \n");
                check = false;
                input.next();
            }
        } while (!(check));

        return age;

    }

    public static int findHeartRate(Scanner input) {
        boolean check;
        int hr = 0;

        do {
            System.out.print("Please enter your resting heart rate: ");

            if (input.hasNextInt()) {
                hr = input.nextInt();
                check = true;
            } else {
                System.out.print("You did not enter a valid resting heart rate. \n");
                check = false;
                input.next();
            }
        } while (!(check));

        return hr;
    }

    public static void printFormat(int heartRate, int age)  {
        System.out.printf("Resting Pulse: %d        Age: %d\n\n", heartRate, age);
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
    }

    public static double getBPM(int age, int heartRate, double intensity) {

        double bpm = Double.valueOf((((220 - age) - heartRate) * intensity) + heartRate);
        return bpm;
    }

    public static void outputResults(int age, int heartRate) {

        for (int i=55; i<=95; i+=5) {

            double intensity = Double.valueOf(i);
            intensity /= 100;

            double bpm = getBPM(age, heartRate, intensity);

            System.out.printf("%d%%          | %.0f bpm\n", i, bpm);
        }
    }
}