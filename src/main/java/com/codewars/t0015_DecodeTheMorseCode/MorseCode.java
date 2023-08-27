package com.codewars.t0015_DecodeTheMorseCode;

public class MorseCode {
    static final char[] english = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};

    static final String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
            ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
            "--..--", ".-.-.-", "..--.."};

    static char get(String morseCode) {
        for (int i = 0; i < morse.length; i++) {
            if (morse[i].equals(morseCode)) {
                return english[i];
            }
        }
        return ' ';
    }
}