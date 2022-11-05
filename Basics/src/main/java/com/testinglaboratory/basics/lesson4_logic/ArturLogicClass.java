package com.testinglaboratory.basics.lesson4_logic;

public class ArturLogicClass {


    public static void main(String[] args) {
        int one = 23;
        double two = 23.23;

        String four = "Piatka";
        String five = "Piatka";

        System.out.println("Logical Operators < > == !=  <= >=");
        System.out.println("is one smaller than two? " + (one < two));
        System.out.println("is two smaller than one? " + (one > two));
        System.out.println("is one equal than two? " + (one == two));
        System.out.println("is one different than two? " + (one != two));

        System.out.println(four == five);

        System.out.println(four.equals(five));

        //TODO declare two identical numbers and string and try to compare it
    }
}
