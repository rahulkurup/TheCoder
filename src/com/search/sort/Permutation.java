package com.search.sort;

public class Permutation {

    public static void main(String[] args) {
        permutation(0, "rahul".toCharArray());
    }


    public static void permutation(int start, char[] s) {
        if(start == s.length-1) {
            System.out.println(String.valueOf(s));
            return;
        }
        for(int i = start + 1; i < s.length; i++) {
            char temp = s[start];
            s[start] = s[i];
            s[i] = temp;
            permutation(start + 1, s);
        }
    }
}
