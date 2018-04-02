package com.finix.alexcuva.kataday.day5;

import com.finix.alexcuva.kataday.day6.Chocolate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.*;


@RunWith(JUnit4.class)
public class ChocolateTest {

    @Test
    public void shouldReturn1When2x1() {
        int result = Chocolate.breakChocolate(2, 1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturn2When3x1() {
        int result = Chocolate.breakChocolate(3,1);
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldReturn4When2x2() {
        int result = Chocolate.breakChocolate(2,2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldReturn24When5x5() {
        int result = Chocolate.breakChocolate(5,5);
        assertThat(result).isEqualTo(24);
    }

}
