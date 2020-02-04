package com.cecum.testing;

/**
 * DateUtil
 */
public class DateUtil {

    public static boolean isLeapyear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ){
            return true;
        }
        else{
            return false;
        }
    }
}