package com.cecum.testing;

/**
 * StringUtil
 */
public class StringUtil {

    public static String repeat(String str, int times) {
        if (times < 0) {
            throw new IllegalArgumentException("negative times not alloned");
        }

        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }

    public static boolean isEmpty(String str) {
        if (str == null) {
            return true;
        }
        return str.isEmpty();
    }
}