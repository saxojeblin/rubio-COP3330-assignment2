/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex38;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String strNumberList = askUserInfo();

        char[] numbers = convertNumberList(strNumberList);

        int[] evenNumbers = filterEvenNumbers(numbers);

        printEvenNumbers(evenNumbers);
    }

    public static String askUserInfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String info = input.nextLine();
        return info;
    }

    public static char[] convertNumberList(String list) {
        char[] numbers = new char[(list.length() + 1) / 2];

        int count = 0, index = 0;

        while(count != numbers.length) {
            if (list.charAt(index) != ' ') {
                numbers[count] = list.charAt(index);
                count++;
            }
            index++;
        }

        return numbers;
    }

    public static int[] filterEvenNumbers(char[] numbers) {

        int nEvenNum = 0;
        int index = 0;

        for (int i = 0; i< numbers.length; i++) {
            char c = numbers[i];
            int num = Character.getNumericValue(c);
            if(num % 2 == 0) {
                nEvenNum++;
            }
        }

        int[] evenNumbers = new int[nEvenNum];

        for (int i = 0; i< numbers.length; i++) {
            char c = numbers[i];
            int num = Character.getNumericValue(c);
            if(num % 2 == 0) {
                evenNumbers[index] = num;
                index++;
            }
        }

        return evenNumbers;
    }

    public static void printEvenNumbers(int[] evenNumbers) {
        System.out.print("The even numbers are ");

        for(int i : evenNumbers) {
            System.out.print(i + " ");
        }

    }
}