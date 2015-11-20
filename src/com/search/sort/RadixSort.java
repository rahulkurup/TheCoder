package com.search.sort;

public class RadixSort {

    public static final int  THE_BASE = 10;

    public static void main(String[] args) {

        int[] array = {165, 142, 139, 110, 1000 , 3 , 1}; // Input

        radixSorter(array);
    }


    public static void radixSorter(int [] a) {

        // Find Max in array
        int max = Integer.MIN_VALUE;

        for(int number : a) {
            if(number > max) {
                max = number;
            }
        }

        int count = 0;
        while(max > 0) {
            countSort(a, count++);
            max = max /10;
        }
        
        for(int num : a) {
            System.out.println(num);
        }
    }


    public static void countSort(int[] a, int count) {

        int [] countArray = new int[THE_BASE];
        int [] tempArray = new int[a.length];
        int division = 1;

        for(int i = 0; i < a.length; i++) {
            tempArray[i] = a[i];
        }

        // Go through array and populate the count array
        for( int i = 0 ; i < tempArray.length ; i++) {

            if(count != 0) {
                division = count * THE_BASE;
            }
            int digit = (tempArray[i] / (division)) % THE_BASE;
            countArray[digit] = ++countArray[digit];
        }

        // Process the count array
        for(int j = 1 ; j < countArray.length; j++) {
            countArray[j] = countArray[j - 1] + countArray[j]; 
        }

        // Do the sort
        for( int i = tempArray.length - 1  ; i >= 0 ; i--) {
            a[--countArray[(tempArray[i] / (division)) % THE_BASE]] = tempArray[i];
        }
    }
}