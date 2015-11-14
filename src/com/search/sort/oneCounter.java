package com.search.sort;

public class oneCounter {

    public static void main(String[] args) {
        int a[] = {1,1,1,1,1,1,1,1,1,0,0,0,0,0,0};
        // {1,1,1,1,1,1,1,1,1}
        // {0}
        System.out.println(counter(0, a.length - 1, a));
    }


    public static int counter(int low, int high, int[] a) {

        int middle = (high + low) /2;
        if(low <= high) {
            if(a[middle] == 1 && ((middle == high) || a[middle +1] == 0)) {
                return middle + 1;
            }
            else if(a[middle] == 1) {
                return counter(middle + 1, high, a);
            } else if (a[middle] ==  0) {
                return counter(low, middle - 1, a);
            }
        }
        return -1;
    }
}