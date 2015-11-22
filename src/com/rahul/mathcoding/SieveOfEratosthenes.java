package com.rahul.mathcoding;

import java.util.ArrayList;
import java.util.List;


public class  SieveOfEratosthenes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        primeGenerator(25);

    }



    public static void primeGenerator(final int high) {

        int[] array = new int[high + 1];
        List<Integer> output = new ArrayList<Integer>();


        for (int i = 2; i< array.length; i++) {

            if(array[i] == 0) {
                //We found a prime
                output.add(i);
                markNotPrime(array, i);
                continue;
            }
        }
        for(int k : output) {
            System.out.println(k);
        }
    }


    public static void markNotPrime(int[] a , int jump) {

        for(int j = jump; j < a.length; j = j + jump) {
            // Mark as not Prime
            a[j] = 1;
        }
    }
}