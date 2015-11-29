package com.rahul.mathcoding;

/*  Test Result
 * 
 * 
 * 10 
 * 
 * 
 */

public class BinaryToDecimalConveter {

    public static void main(String[] args) {

        System.out.println(binaryToDecimal1("1010"));
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
}