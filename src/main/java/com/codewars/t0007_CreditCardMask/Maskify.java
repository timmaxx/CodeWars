package com.codewars.t0007_CreditCardMask;

public class Maskify {
    public static String maskify(String str) {
        StringBuilder result = new StringBuilder();
        result.append("#".repeat(Math.max(0, str.length() - 4)));
        for (int i = (Math.max(str.length() - 4, 0)); i < str.length(); i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}