package com.finix.alexcuva.kataday.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        for (int i = 0; i < n; i++) {
            int size = s.length;
            Double total = Double.valueOf(s[size-3] + s[size-2] + s[size-1]);
//            myList.add(total);
        }
        return s;
    }
}
