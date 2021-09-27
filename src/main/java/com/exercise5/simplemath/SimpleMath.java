/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Williams
 */

package com.exercise5.simplemath;
import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstnum, secondnum;
        int i, j, sum, difference, product, quotient;

        System.out.println("What is the first number? ");
        firstnum = input.nextLine();
        i = Integer.parseInt(firstnum);

        System.out.println("What is the second number? ");
        secondnum = input.nextLine();
        j = Integer.parseInt(secondnum);

        sum = i + j;
        difference = i - j;
        product = i * j;
        quotient = i / j;

        System.out.println(firstnum + " + " + secondnum + " = " + sum + "\n" +
                            firstnum + " - " + secondnum + " = " + difference + "\n" +
                            firstnum + " * " + secondnum + " = " + product + "\n" +
                            firstnum + " / " + secondnum + " = " + quotient);
    }
}
