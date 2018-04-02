package com.finix.alexcuva.kataday.day8;

import static org.junit.Assert.*;

import com.finix.alexcuva.kataday.day8.Tortoise;
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class TortoiseTest {

    @Test
    public void shouldReturnNull_Ifv1EqualsToV2() {
        Assertions.assertThat(Tortoise.race(720, 720, 60)).isNullOrEmpty();
    }

    @Test
    public void shouldReturnNull_Ifv1GreatherToV2() {
        Assertions.assertThat(Tortoise.race(820, 720, 60)).isNullOrEmpty();
    }

    @Test
    public void shouldReturn2Hours_Ifv1Is80_Andv2Is100_AndDistanceIs40() {
        Assertions.assertThat(Tortoise.race(80, 100, 40)).containsExactly(2,0,0);
    }

    @Test
    public void shouldReturn10Min_Ifv1Is40_Andv2Is100_AndDistanceIs10() {
        Assertions.assertThat(Tortoise.race(40, 100, 10)).containsExactly(0,10,0);
    }

    @Test
    public void shouldReturn10Sec_Ifv1Is400_Andv2Is4000_AndDistanceIs10() {
        Assertions.assertThat(Tortoise.race(400, 4000, 10)).containsExactly(0,0,10);
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 32, 18}, Tortoise.race(720, 850, 70));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{3, 21, 49}, Tortoise.race(80, 91, 37));
    }


}
