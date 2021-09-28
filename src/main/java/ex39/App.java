/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex39;

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

        //List<Map> sortedEmployeeList = sortEmployeeList(employeeList);

        printSortedEmployeeList(/*sorted*/employeeList);

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

    public static List<Map> sortEmployeeList(List<Map> employeeList) {

        List<Map> sortedEmployeeList = new ArrayList<Map>();
        Map temp = new HashMap();
        Map temp2 = new HashMap();
        Map toAdd = new HashMap();

        for (int i=0; i<employeeList.size(); i++) {
            for (int j = 1; j<employeeList.size(); j++) {

                temp = employeeList.get(0);
                temp2 = employeeList.get(j);

                String tempLName = (String) temp.get("lname");
                String tempLName2 = (String) temp2.get("lname");

                if (tempLName.compareTo(tempLName2) < 0)  {

                }
            }
            sortedEmployeeList.add(temp);
        }
        return sortedEmployeeList;


    }

    public static void printSortedEmployeeList(List<Map> list) {
        System.out.println("Name          | Position        | Separation Date");
        System.out.println("-------------------------------------------------");
        System.out.printf("%s %s   | %s            | %s\n", list.get(0).get("fname"), list.get(0).get("lname"), list.get(0).get("position"), list.get(0).get("sep"));
        System.out.printf("%s %s   | %s            | %s\n", list.get(1).get("fname"), list.get(1).get("lname"), list.get(1).get("position"), list.get(1).get("sep"));
        System.out.printf("%s %s   | %s            | %s\n", list.get(2).get("fname"), list.get(2).get("lname"), list.get(2).get("position"), list.get(2).get("sep"));
        System.out.printf("%s %s   | %s            | %s\n", list.get(3).get("fname"), list.get(3).get("lname"), list.get(3).get("position"), list.get(3).get("sep"));
        System.out.printf("%s %s   | %s            | %s\n", list.get(4).get("fname"), list.get(4).get("lname"), list.get(4).get("position"), list.get(4).get("sep"));
        System.out.printf("%s %s   | %s            | %s\n", list.get(5).get("fname"), list.get(5).get("lname"), list.get(5).get("position"), list.get(5).get("sep"));
    }
}