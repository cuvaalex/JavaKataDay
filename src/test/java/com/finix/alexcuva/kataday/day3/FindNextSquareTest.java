package com.finix.alexcuva.kataday;

import com.finix.alexcuva.kataday.day3.NumberFun;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class FindNextSquareTest {
    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }


}