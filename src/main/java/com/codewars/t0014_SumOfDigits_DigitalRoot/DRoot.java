package com.codewars.t0014_SumOfDigits_DigitalRoot;

/*
6 kyu
Sum of Digits / Digital Root
3986
769
90% of 22,621
26,722 of 235,247
user578387
2 Issues Reported
 Java
17
VIM
EMACS
Instructions
Output
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
*/

public class DRoot {
    public static int digital_root(int n) {
        if (n < 10) {
            return n;
        }
        String strFromInt = Integer.toString(n);
        int localDRoot = 0;
        for (int i = 0; i < strFromInt.length(); i++) {
            char ch = strFromInt.charAt(i);
            localDRoot += ch - 48;
        }
        return digital_root(localDRoot);
    }
}
