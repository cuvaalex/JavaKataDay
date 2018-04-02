package com.finix.alexcuva.kataday.day7;

import com.finix.alexcuva.kataday.day7.Maskify;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class MaskifyTest {


    @Test
    public void testSolution() {
        assertEquals("############5616", Maskify.maskify("4556364607935616"));
    }


    @Test
    public void testSolution2() {
        assertEquals("#######5616",Maskify.maskify("64607935616"));
    }
    @Test
    public void testSolution3() {
        assertEquals("1", Maskify.maskify(               "1"));
     }

    @Test
    public void testSolution4() {
        assertEquals("", Maskify.maskify(""));

    }

    @Test
    public void testSolution5() {
        assertEquals("##ippy", Maskify.maskify("Skippy"));
    }

    @Test
    public void testSolution6() {
        assertEquals("####################################man!", Maskify.maskify("Nananananananananananananananana Batman!"));
    }
}