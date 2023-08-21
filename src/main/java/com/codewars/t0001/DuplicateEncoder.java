package com.codewars.t0001;

import java.util.HashMap;
import java.util.Map;

// 6 kyu
/*
The goal of this exercise is to convert a string to a new string
where each character in the new string is "(" if that character appears only once in the original string,
or ")" if that character appears more than once in the original string.
Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("

Notes
Assertion messages may be unclear about what they display in some languages.
If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
*/

public class DuplicateEncoder {
    static String encode(String word) {
        Map<Character, Boolean> map = new HashMap<>();
        String lowCaseWord = word.toLowerCase();

        for (int i = 0; i < lowCaseWord.length(); i++) {
            Character ch = lowCaseWord.charAt(i);
            map.put( ch, map.containsKey( ch));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lowCaseWord.length(); i++) {
            Character ch = lowCaseWord.charAt(i);
            if (map.get(ch)) {
                sb.append(")");
            } else {
                sb.append("(");
            }
        }
        return sb.toString();
    }
}
