package com.search.sort;

public class InsertionSort {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int [] array = {2,7 ,8, 45, 2,0,49,6};
        Insertionsort(array);

        for(int a : array) {
            System.out.println(a);
        }
    }

    /**
     * @param array
     */
    public static void Insertionsort(int[] array) {

        for(int i = 1; i < array.length; i++) {
            int number = array[i];
            int j = i-1;            
            while(j >=0 && array[j] > number) {
                array[j+1] = array[j];
                j--;
            }
            if(j == i-1) {

            } else {
                array[j+1]  = number;               
            }
        }   
    }
}