package com.rahul.mathcoding;


import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CharacterHistogram {

    public static void main(String[] args) {

        histogram("abcdaaaaaaaaaaaaabbbbbbbbbcccccccccccccccccccccccccddddddddddddefghi");
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