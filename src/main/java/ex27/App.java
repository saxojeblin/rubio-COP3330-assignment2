/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex27;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        String fName, lName, zip, ID;

        System.out.print("Enter the first name: ");
        fName = input.nextLine();
        System.out.print("Enter the lsat name: ");
        lName = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        ID = input.nextLine();

        validateInput(fName, lName, zip, ID);
    }

    public static void validateInput(String fName, String lName, String zip, String ID) {

        int errors = 0;

        errors += validateFirstName(fName);
        errors += validateLastName(lName);
        errors += validateZip(zip);
        errors += validateID(ID);

        if (errors == 0) {
            System.out.print("There were no errors found.");
        }

    }

    public static int validateFirstName(String fName) {

        int count = 0;

        if (fName.length() < 2)   {
            System.out.println("The first name must be at least 2 characters long.");
            count++;

            if (fName.length() == 0) {
                System.out.println("The first name must be filled in.");
                count++;
            }
        }

        return count;
    }

    public static int validateLastName(String lName) {
        int count = 0;

        if (lName.length() < 2)   {
            System.out.println("The last name must be at least 2 characters long.");
            count++;

            if (lName.length() == 0) {
                System.out.println("The last name must be filled in.");
                count++;
            }
        }

        return count;
    }

    public static int validateZip(String zip) {
        int count = 0;

        if (zip.length() != 5) {
            System.out.println("The zipcode must be a 5 digit number.");
            count++;
        }
        else if(!Pattern.matches("[0-9]+", zip)) {
            System.out.println("The zipcode must be a 5 digit number.");
            count++;
        }

        return count;
    }

    public static int validateID(String ID) {
        int count = 0;

        if (ID.length() != 7) {
            System.out.println("The employee ID must be in the format of AA-1234.");
            count++;
            return count;
        }

        for(int i=0; i<2; i++) {
            if(!Character.isLetter(ID.charAt(i))) {
                System.out.println("The employee ID must be in the format of AA-1234.");
                count++;
                return count;
            }
        }

        if(ID.charAt(2) != '-') {
            System.out.println("The employee ID must be in the format of AA-1234.");
            count++;
            return count;
        }

        for(int i=3; i<7; i++) {
            if(!Character.isDigit(ID.charAt(i))) {
                System.out.println("The employee ID must be in the format of AA-1234.");
                count++;
                return count;
            }
        }

        return count;
    }

}