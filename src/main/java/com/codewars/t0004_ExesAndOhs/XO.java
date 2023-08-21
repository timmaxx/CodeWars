package com.codewars.t0004_ExesAndOhs;

public class XO {

    public static boolean getXO (String str) {
        int countOfX = 0;
        int countOfO = 0;
        String strLowCase = str.toLowerCase();

        for (int i = 0; i < strLowCase.length(); i++) {
            if(strLowCase.charAt(i) == 'x') {
                countOfX++;
                continue;
            }
            if(strLowCase.charAt(i) == 'o') {
                countOfO++;
            }
        }

        return countOfX == countOfO;
    }
}
