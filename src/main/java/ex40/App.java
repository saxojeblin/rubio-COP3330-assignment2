/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex40;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map m1 = getFirstMap();
        Map m2 = getSecondMap();
        Map m3 = getThirdMap();
        Map m4 = getFourthMap();
        Map m5 = getFifthMap();
        Map m6 = getSixthMap();

        List<Map> employeeList = createEmployeeList(m1, m2, m3, m4, m5, m6);

        String search = findSearch();

        List<Map> filteredEmployeeList = filterEmployeeList(employeeList, search);

        printFilteredResults(filteredEmployeeList);
    }

    public static Map getFirstMap() {
        Map m = new HashMap();
        m.put("fname", "John");
        m.put("lname", "Johnson");
        m.put("position", "Manager");
        m.put("sep", "2016-12-31");
        return m;
    }

    public static Map getSecondMap() {
        Map m = new HashMap();
        m.put("fname", "Tou");
        m.put("lname", "Xiong");
        m.put("position", "Software Engineer");
        m.put("sep", "2016-10-05");
        return m;
    }

    public static Map getThirdMap() {
        Map m = new HashMap();
        m.put("fname", "Michaela");
        m.put("lname", "Michaelson");
        m.put("position", "District Manager");
        m.put("sep", "2015-12-19");
        return m;
    }

    public static Map getFourthMap() {
        Map m = new HashMap();
        m.put("fname", "Jake");
        m.put("lname", "Jacobson");
        m.put("position", "Programmer");
        m.put("sep", "");
        return m;
    }

    public static Map getFifthMap() {
        Map m = new HashMap();
        m.put("fname", "Jaacquelyn");
        m.put("lname", "Jackson");
        m.put("position", "DBA");
        m.put("sep", "");
        return m;
    }

    public static Map getSixthMap() {
        Map m = new HashMap();
        m.put("fname", "Sally");
        m.put("lname", "Webber");
        m.put("position", "Web Developer");
        m.put("sep", "2015-12-18");
        return m;
    }

    public static List<Map> createEmployeeList(Map m1, Map m2, Map m3, Map m4, Map m5, Map m6) {
        List<Map> employeeList = new ArrayList<Map>();

        employeeList.add(m1);
        employeeList.add(m2);
        employeeList.add(m3);
        employeeList.add(m4);
        employeeList.add(m5);
        employeeList.add(m6);

        return employeeList;

    }

    public static String findSearch() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String search = input.nextLine();
        return search;
    }

    public static List<Map> filterEmployeeList(List<Map> employeeList, String search) {

        List<Map> filteredList = new ArrayList<Map>();
        Map temp = new HashMap<>();

        for (int i=0; i<employeeList.size(); i++) {

            temp = employeeList.get(i);
            String fname = (String) temp.get("fname");
            String lname = (String) temp.get("lname");

            if (fname.contains(search) || lname.contains(search)) {
                filteredList.add(temp);
            }

            temp = null;
        }
        return filteredList;
    }

    public static void printFilteredResults(List<Map> filtered) {
        System.out.print("\nResults: \n\n");
        System.out.println("Name                  | Position            | Separation Date");
        System.out.println("-------------------------------------------------");
        for (int i=0; i<filtered.size(); i++) {
            System.out.printf("%s %s   | %s    | %s\n", filtered.get(i).get("fname"), filtered.get(i).get("lname"), filtered.get(i).get("position"), filtered.get(i).get("sep"));
        }
    }
}