/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package ex37;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int check = 0;

        int length = findLength(input);
        int specialC = findSpecialChar(input);
        int numbers = findNumbers(input);

        ArrayList<Character> letterList = new ArrayList<>();
        ArrayList<Character> numberList = new ArrayList<>();
        ArrayList<Character> specialCharList = new ArrayList<>();

        generateLetterList(letterList);
        generateNumberList(numberList);
        generateSpecialCharList(specialCharList);

        ArrayList<Character> pwLetters = new ArrayList<>();
        obtainPasswordLetters(pwLetters, letterList, length, specialC, numbers);

        ArrayList<Character> pwNumbers = new ArrayList<>();
        obtainPasswordNums(pwNumbers, numberList, numbers);

        ArrayList<Character> pwSpecial = new ArrayList<>();
        obtainPasswordSpecial(pwSpecial, specialCharList, specialC);

        ArrayList<Character> password = new ArrayList<>();
        generatePassword(password, pwLetters, pwNumbers, pwSpecial);

        printPassword(password);

    }

    public static int findLength(Scanner input) {
        System.out.print("What's the minimum length? ");
        int len = input.nextInt();
        return len;
    }

    public static int findSpecialChar(Scanner input) {
        System.out.print("How many special characters? ");
        int sc = input.nextInt();
        return sc;
    }

    public static int findNumbers(Scanner input) {
        System.out.print("How many numbers? ");
        int num = input.nextInt();
        return num;
    }

    public static void generateLetterList(ArrayList<Character> letters) {
        letters.add('a');
        letters.add('b');
        letters.add('c');
        letters.add('d');
        letters.add('e');
        letters.add('f');
        letters.add('g');
        letters.add('h');
        letters.add('i');
        letters.add('j');
        letters.add('k');
        letters.add('l');
        letters.add('m');
        letters.add('n');
        letters.add('o');
        letters.add('p');
        letters.add('q');
        letters.add('r');
        letters.add('s');
        letters.add('t');
        letters.add('u');
        letters.add('v');
        letters.add('w');
        letters.add('x');
        letters.add('y');
        letters.add('z');
    }

    public static void generateNumberList(ArrayList<Character> numbers) {
        numbers.add('0');
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');
    }

    public static void generateSpecialCharList(ArrayList<Character> specialChar) {
        specialChar.add('!');
        specialChar.add('@');
        specialChar.add('#');
        specialChar.add('$');
        specialChar.add('%');
        specialChar.add('&');
        specialChar.add('*');
    }

    public static void obtainPasswordLetters(ArrayList<Character> letters, ArrayList<Character> letterList, int len, int special, int num) {
        int numLetters = special + num + 1;
        Random randNum = new Random();

        for (int i=0; i<numLetters; i++) {
            int ranIndex = randNum.nextInt(letterList.size());
            letters.add(letterList.get(ranIndex));
        }

    }

    public static void obtainPasswordNums(ArrayList<Character> numbers, ArrayList<Character> numberList, int num) {

        Random randNum = new Random();

        for (int i=0; i<num; i++) {
            int ranIndex = randNum.nextInt(numberList.size());
            numbers.add(numberList.get(ranIndex));
        }

    }

    public static void obtainPasswordSpecial(ArrayList<Character> special, ArrayList<Character> specialList, int specialNum) {

        Random randNum = new Random();

        for (int i=0; i<specialNum; i++) {
            int ranIndex = randNum.nextInt(specialList.size());
            special.add(specialList.get(ranIndex));
        }

    }

    public static void generatePassword(ArrayList<Character> password, ArrayList<Character> pwLetters, ArrayList<Character> pwNumbers, ArrayList<Character> pwSpecial) {

        StringBuilder strPassword = new StringBuilder();

        for(char letter : pwLetters) {
            password.add(letter);
        }
        for(char number : pwNumbers) {
            password.add(number);
        }
        for(char special : pwSpecial) {
            password.add(special);
        }

        Collections.shuffle(password);

    }

    public static void printPassword(ArrayList<Character> password) {
        System.out.print("Your password is ");

        for(char character : password) {
            System.out.printf("%c",character);
        }
    }
}