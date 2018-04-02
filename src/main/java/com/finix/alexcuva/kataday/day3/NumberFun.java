package com.finix.alexcuva.kataday.day3;

import java.util.logging.Logger;

public class NumberFun {

    public static long findNextSquare(long sq) {
        double squareRoot = Math.sqrt((double) sq);
        System.out.print(squareRoot);
        if(squareRoot % 1 > 0) return -1;
        return (long) Math.pow (squareRoot+1, 2);
    }
}