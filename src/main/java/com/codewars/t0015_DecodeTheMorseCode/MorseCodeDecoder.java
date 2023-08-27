package com.codewars.t0015_DecodeTheMorseCode;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
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