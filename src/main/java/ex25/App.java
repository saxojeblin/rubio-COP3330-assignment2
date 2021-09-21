
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex25;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App
{
    public static void main( String[] args ) {
        Scanner input= new Scanner(System.in);
        String password, strength;
        int pwStrength;

        System.out.print("Please enter your pasasword: ");
        password = input.nextLine();

        pwStrength = checkPasswordStrength(password);

        if (pwStrength == 1) {
            strength = "very weak";
        }
        else if (pwStrength == 2) {
            strength = "weak";
        }
        else if (pwStrength == 3) {
            strength = "strong";
        }
        else if (pwStrength == 4) {
            strength = "very strong";
        }
        else {
            strength = "unknown strength";
        }

        System.out.println("The password '" + password + "' is a " + strength + " password.");

    }

    public static int checkPasswordStrength(String pw) {

        int strength = 0;

        if (pw.length() < 2) {
            return strength;
        }

        if (pw.length() < 8) {
            strength = findWeakerPassword(pw);
        }
        else {
            strength = findStrongerPassword(pw);
        }

        return strength;
    }

    public static int findWeakerPassword(String pw) {
        if(Pattern.matches("[0-9]+" , pw) ) {
            return 1;
        }

        else if(Pattern.matches("[a-zA-Z]+", pw)) {
            return 2;
        }
        else  {
            return 0;
        }
    }

    public static int findStrongerPassword(String pw) {
        char[] pwArray = pw.toCharArray();
        int numbers = 0, letters = 0, special = 0;
        String specialCharacters = "!@#$%^&*()'+,-./:;<=>?[]_`{}|";

        for (char c : pwArray) {
            if(Character.isDigit(c)) {
                numbers++;
            }

            if (Character.isLetter(c)){
                letters++;
            }
        }

        for (int i=0; i<pw.length(); i++) {
            char ch = pw.charAt(i);
            if (specialCharacters.contains(Character.toString(ch))) {
                special++;
            }
        }

        if (letters > 1 && numbers >= 1 && special == 0) {
            return 3;
        }
        else if (letters > 1 && numbers > 1 && special > 1) {
            return 4;
        }
        else  {
            return 0;
        }
    }
}
