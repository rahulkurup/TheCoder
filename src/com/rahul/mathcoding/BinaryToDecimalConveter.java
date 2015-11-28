package com.rahul.mathcoding;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BinaryToDecimalConveter {

    public static void main(String[] args) {

        System.out.println(binaryToDecimal1("101"));
        histogram("abcdaaaaaaaaaaaaabbbbbbbbbcccccccccccccccccccccccccddddddddddddefghi");
    }


    /**
     * @param binaryString
     * @return
     */
    public static int binaryToDecimal1(String binaryString) {

        int decimal = 0;
        int power = 0;
        int binary = Integer.parseInt(binaryString);
        if (binary< 0) {
            System.out.print("invalid input");
            return -1;
        }
        while(binary > 0) {
            int lastDigit = binary%10;
            decimal = (int) (decimal + (lastDigit * Math.pow(2, power++)));
            binary = binary/10;
        }   
        return decimal;
    }


    /**
     * @param input
     */
    public static void histogram(String input) {

        final Map<Character, Integer> map = new TreeMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (! map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), 0);
            }
            map.put(input.charAt(i), map.get(input.charAt(i)) + 1);       
        }

        for (final Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey());
            for (int i = 0 ; i < entry.getValue() || i == 79; i ++ ) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}