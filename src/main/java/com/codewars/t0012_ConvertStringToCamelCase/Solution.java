package com.codewars.t0012_ConvertStringToCamelCase;

/*
* 6 kyu
Convert string to camel case
280051288% of 14,68919,622 of 158,147jhoffner
Java
TRAINNEXT KATA
Details
Solutions
Forks (37)
Discourse (863)
Collect|
DESCRIPTION:
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
* */

class Solution{

    static String toCamelCase(String s){
        StringBuilder result = new StringBuilder();
        boolean toUpperCase = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '_' || ch == '-') {
                toUpperCase = true;
            } else {
                if (toUpperCase) {
                    ch = Character.toUpperCase(ch);
                    toUpperCase = false;
                }
                result.append(ch);
            }
        }

        return result.toString();
    }
}