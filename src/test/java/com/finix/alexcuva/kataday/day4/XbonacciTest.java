package com.finix.alexcuva.kataday.day4;

import com.finix.alexcuva.kataday.day4.Xbonacci;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class XbonacciTest {

    Xbonacci xbonacci = new Xbonacci();
    
    @Test
    public void shouldReturn0_0_1_1If0_0_1() {
        double[] startArray = {0,0,1};
        double[] result = xbonacci.tribonacci(startArray, 1);
        assertThat(result).containsExactly(0,0,1,1);
    }
    
    @Test
    public void shouldReturn0_0_1_1_2If0_0_1Times2(){
        double[] startArray = {0,0,1};
        double[] result = xbonacci.tribonacci(startArray, 2);
        assertThat(result).containsExactly(0,0,1,1,2);
    }
}