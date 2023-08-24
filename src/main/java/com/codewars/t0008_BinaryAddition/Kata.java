package com.codewars.t0008_BinaryAddition;

public class Kata{

    public static String binaryAddition(int a, int b){
        int intSum = a + b;
        StringBuilder strBinarySum = new StringBuilder();
        while (intSum != 0) {
            strBinarySum.insert( 0, intSum % 2 == 0 ? '0': '1');
            intSum /= 2;
        }
        return strBinarySum.toString();
    }
}