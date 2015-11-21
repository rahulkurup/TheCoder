package com.search.sort;

import java.util.ArrayList;
import java.util.List;


/*Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples:

ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80

ar1[] = {1, 5, 5}
ar2[] = {3, 4, 5, 5, 10}
ar3[] = {5, 5, 10, 20}
Output: 5, 5*/

public class CommonInThreeArray {

    public static void main(String[] args) {
        
        for(int i : commonFinder( new int[] {1, 2 , 5, 10},
                new int[] {1, 9, 10, 11, 99, 100}, new int[] {1,10,100})) {
            System.out.println(i);
        }
    }

    /**
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static List<Integer> commonFinder(int[]a, int[]b, int[] c) {
        
        List<Integer> result = new ArrayList<Integer>();
        int i;int k; int j;
        i=k=j= 0;
        
        if((a[i] == b[j]) && (b[j] == c[k])) {
            result.add(a[i]);
            i++;
            j++;
            k++;
        } else if(a[i] < b[j]) {
            i++;
        } else if(b[j] < c[k]){
            j++;
        } else {
            k++;
        }
        return result;
    }
}