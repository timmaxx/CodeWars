package com.codewars.t0016_DecodeTheMorseCodeAdvanced;

import com.codewars.t0015_DecodeTheMorseCode.MorseCode;

public class MorseCodeDecoder {

    public static String decodeBits(String bits) {
        String result;
        result = bits.replaceAll("0{14}", "   ");
        result = result.replaceAll("0{6}", " ");
        result = result.replaceAll("1{6}", "-");
        result = result.replaceAll("1{2}", ".");
        result = result.replaceAll("0{2}", "");

        return result;
    }

    public static String decodeMorse(String morseCode) {
        StringBuilder result = new StringBuilder();
        String[] arrOfWords = morseCode.trim().split(" {3}");

        for (String word: arrOfWords) {
            String[] arrOfLetters = word.split(" ");
            for (String letter: arrOfLetters) {
                result.append(MorseCode.get(letter));
            }
            result.append(' ');
        }

        return result.toString().trim();
    }
}