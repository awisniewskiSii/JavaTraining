package com.testinglaboratory.basics.lesson4_logic;

import java.util.Scanner;

public class ArturFlowControlClass {
    public static void main(String[] args) {
        int firstNumberFromUser;
        int secondNumberFromUser;

        Scanner scanner = new Scanner(System.in);

        System.out.println("type number one:  ");
        firstNumberFromUser = scanner.nextInt();
        System.out.println("type number two:  ");
        secondNumberFromUser = scanner.nextInt();

        if (firstNumberFromUser == secondNumberFromUser) {
            System.out.println("numbers equal");
        }

        if (firstNumberFromUser > secondNumberFromUser) {
            System.out.println("you first number is bigger than ONE");
        }

        if (firstNumberFromUser > 0 && secondNumberFromUser < 100) {
            System.out.println("your number is bigger than 0 and smaller than 100");
        }
    }
}