
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        String first, second;
        Boolean check;
        char quote = '"';

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        first = input.nextLine();
        System.out.print("Enter the second string: ");
        second = input.nextLine();

        check = check_anagram(first, second);

        if (check) {
            System.out.println(quote + first + quote + " and " + quote + second + quote + " are anagrams.");
        }
        else {
            System.out.println(quote + first + quote + " and " + quote + second + quote + " are NOT anagrams.");
        }
    }

    public static Boolean check_anagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        else  {
            char [] str1Array = first.toLowerCase().toCharArray();
            char [] str2Array = second.toLowerCase().toCharArray();
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            if (Arrays.equals(str1Array, str2Array)) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
