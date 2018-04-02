package com.finix.alexcuva.kataday.day1;

import java.util.stream.Stream;

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int skip = 0;
        for (int i = 0; i < n; i++) {
            skip += i;
        }
        System.out.println(skip);
        int sumOfOdd = Stream.iterate(0, i  -> i+1)
                .filter(i -> i % 2 !=0)
                .skip(skip)
                .limit(n)
                .mapToInt(i -> i).sum();
        return sumOfOdd;
    }

}