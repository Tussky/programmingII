package edu.houghton.code.week3;

import java.util.Scanner;

/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 *
 * In this class your should test your ChangeValue Class
 */
public class ChangeValueDriver{


    public static void main(String[] args) {
        //instantiate your scanner object
        Scanner input = new Scanner(System.in);
        //declare the local val1 and val2 integer variables
        int val1, val2;

        //prompt the user for input of two integers
        System.out.println("value 1");
        val1 = input.nextInt();
        System.out.println();
        System.out.println("Value 2");
        val2 = input.nextInt();

        //instantiate a changeValue object here
        ChangeValue change = new ChangeValue(val1, val2);
        //call the object method printit here
        change.print();
    }

}