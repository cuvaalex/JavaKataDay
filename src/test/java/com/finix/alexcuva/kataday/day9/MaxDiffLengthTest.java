package com.finix.alexcuva.kataday.day9;

import org.assertj.core.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import org.junit.Test;

@RunWith(JUnit4.class)
public class MaxDiffLengthTest {

    @Test
    public void shouldReturnMinus1IfS1IsEmpty() {
        String[] s1 = new String[0];
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        Assertions.assertThat(MaxDiffLength.mxdiflg(s1, s2)).isEqualTo(-1);
    }

    @Test
    public void shouldReturnMinus1IfS2IsEmpty() {
        String[] s2 = new String[0];
        String[] s1 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        Assertions.assertThat(MaxDiffLength.mxdiflg(s1, s2)).isEqualTo(-1);
    }

    @Test
    public void test() {
        System.out.println("mxdiflg Fixed Tests");
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(13, MaxDiffLength.mxdiflg(s1, s2)); // 13
    }
}
