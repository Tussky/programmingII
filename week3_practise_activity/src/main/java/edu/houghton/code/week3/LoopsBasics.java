package edu.houghton.code.week3;

/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 */

public class LoopsBasics {

    //Task 1
    //get the factorials of n positive integers 1,2,…,1000
    public Long getFactorial(int n){
        Long result=0L;
        //your code here

        long factorial = 1;
        for (int i = 1; i < n; i++){
            factorial *= i;
        }
        return factorial;
    }

    //Task 2
    //get the sum of the series
    public double sumOfSeries(){
        double result=1;

        for (int i = 2; i <= 100; i++){
            result -= (1/i)^(-1*i);
        }

        return result;

    }

    //Task 3
    //gets the sum of a square of odd numbers between 22 and 389
    public int sumOfOddSquares(){
        int result=0;

        for (int i = 23; i < 389; i+=2){
            result += Math.pow(i, 2);
        }

        return result;

    }


}
