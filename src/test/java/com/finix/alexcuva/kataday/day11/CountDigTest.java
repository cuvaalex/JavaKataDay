package com.finix.alexcuva.kataday.day11;

import static org.junit.Assert.*;

import org.junit.Test;


public class CountDigTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn4()  {
        testing(CountDig.nbDig(10, 1), 4);
    }

    @Test
    public void shouldReturn4700() {
        testing(CountDig.nbDig(5750, 0), 4700);
    }
    @Test
    public void shouldReturn9481() {
        testing(CountDig.nbDig(11011, 2), 9481);
    }
    @Test
    public void shouldReturn7733() {
        testing(CountDig.nbDig(12224, 8), 7733);
    }
    @Test
    public void shouldReturn11905() {
        testing(CountDig.nbDig(11549, 1), 11905);
    }

}