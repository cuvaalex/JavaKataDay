package com.finix.alexcuva.kataday.day10;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ArgeTest {


    @Test
    public void shouldReturn3() {
        assertThat(Arge.nbYear(1000, 2, 50, 1200)).isEqualTo(3);
    }

    @Test
    public void shouldReturn15() {
        assertThat(Arge.nbYear(1500, 5, 100, 5000)).isEqualTo(15);
    }

    @Test
    public void shouldReturn10() {
        assertThat(Arge.nbYear(1500000, 2.5, 10000, 2000000)).isEqualTo(10);
    }

    @Test
    public void shouldReturn94() {
        assertThat(Arge.nbYear(1500000, 0.25, 1000, 2000000)).isEqualTo(94);
    }

}