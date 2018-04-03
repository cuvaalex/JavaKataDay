package com.finix.alexcuva.kataday.day9;

import java.util.Arrays;
import java.util.Comparator;

class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        if(a1 == null || a1.length == 0) {
            return -1;
        }
        if(a2 == null || a2.length == 0) {
            return -1;
        }
        String maxA1 = Arrays.stream(a1).max(Comparator.comparing(String::length)).get();
        String minA1 = Arrays.stream(a1).min(Comparator.comparing(String::length)).get();
        String minA2 = Arrays.stream(a2).min(Comparator.comparing(String::length)).get();
        String maxA2 = Arrays.stream(a2).max(Comparator.comparing(String::length)).get();

        // max(abs(length(x) − length(y)))
        return Math.max(Math.abs(maxA1.length() - minA2.length()), Math.abs(minA1.length() - maxA2.length()));

    }
}