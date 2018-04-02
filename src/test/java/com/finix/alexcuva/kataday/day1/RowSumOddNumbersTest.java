package com.finix.alexcuva.kataday.day1;

import static org.junit.Assert.*;

import com.finix.alexcuva.kataday.day1.RowSumOddNumbers;
import org.junit.Test;

public class RowSumOddNumbersTest {

    @Test
    public void test1() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
    }

    @Test
    public void test2() {
        assertEquals(8, RowSumOddNumbers.rowSumOddNumbers(2));
    }

    @Test
    public void test3() {
        assertEquals(27, RowSumOddNumbers.rowSumOddNumbers(3));
    }

    @Test
    public void test4() {
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }

}