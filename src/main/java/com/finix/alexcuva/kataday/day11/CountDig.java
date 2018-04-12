package com.finix.alexcuva.kataday.day11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDig {

    public static int nbDig(int n, int d) {
        /// Given
        char code = (char)('0'+ d);
        List<Integer> myList = Stream.iterate(1, k -> k+1)
                .limit(n)
                .collect(Collectors.toList());

        /// When
        int sum = myList.stream().mapToInt(k -> {
            return  (int) String.valueOf(Math.pow(k,2)).chars()
                .mapToObj(i -> (char) i).filter(i -> i ==  code).count();

        }).sum();

        /// Then
        return sum;


    }
}
