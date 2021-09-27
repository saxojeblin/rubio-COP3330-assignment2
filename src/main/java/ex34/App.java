/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex34;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        String[] employees = new String[5];
        createEmployeeArray(employees);

        printEmployees(employees);
        String remove = findEmployeeToRemove();

        removeEmployee(employees, remove);

        printNewEmployees(employees);

    }

    public static String[] createEmployeeArray(String[] employees) {

        employees[0] = "John Smith";
        employees[1] = "Jackie Jackson";
        employees[2] = "Chris Jones";
        employees[3] = "Amanda Cullen";
        employees[4] = "Jeremy Goodwin";

        return employees;
    }

    public static void printEmployees(String[] employees) {
        System.out.println("There are 5 employees:");
        System.out.printf("%s\n%s\n%s\n%s\n%s\n\n", employees[0], employees[1], employees[2],employees[3],employees[4]);
    }

    public static String findEmployeeToRemove() {
        Scanner input = new Scanner(System.in);
        String employee;
        System.out.print("Enter an employee name to remove: ");
        employee = input.nextLine();
        return employee;
    }

    public static void removeEmployee(String[] employees, String remove) {

        if(remove.equals(employees[0])) {
            employees[0] = employees[1];
            employees[1] = employees[2];
            employees[2] = employees[3];
            employees[3] = employees[4];
        }
        else if(remove.equals(employees[1])) {
            employees[1] = employees[2];
            employees[2] = employees[3];
            employees[3] = employees[4];
        }
        else if(remove.equals(employees[2])) {
            employees[2] = employees[3];
            employees[3] = employees[4];
        }
        else if(remove.equals(employees[3])) {
            employees[3] = employees[4];
        }
        else if(remove.equals(employees[4])) {
            employees[4] = "";
        }
        else {
            System.out.print("That name does not exist.");
            System.exit(0);
        }
    }

    public static void printNewEmployees(String []employees) {
        System.out.println("\nThere are 4 employees:");
        System.out.printf("%s\n%s\n%s\n%s", employees[0], employees[1], employees[2],employees[3]);
    }


}