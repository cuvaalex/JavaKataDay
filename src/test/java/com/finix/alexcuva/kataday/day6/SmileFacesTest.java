package com.finix.alexcuva.kataday.day6;

import com.finix.alexcuva.kataday.day5.SmileFaces;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.*;

@RunWith(JUnit4.class)
public class SmileFacesTest {

    @Test
    public void shouldCount2IfHaveEyesAndMouth() {
        List<String> listSmile = new ArrayList<>();
        listSmile.add(":)");
        listSmile.add(";D");
        assertThat(SmileFaces.countSmileys(listSmile)).isEqualTo(2);
    }

    @Test public void shouldCount0IfHasEyesButNoMouth() {
        List<String> listSmile  = new ArrayList<>();
        listSmile.add(":");
        listSmile.add(";");
        assertThat(SmileFaces.countSmileys(listSmile)).isEqualTo(0);
    }

    @Test
    public void shouldReturn0IfHasMouthButNotEyes(){
        List<String> listSmile = new ArrayList<>();
        listSmile.add(")");
        listSmile.add("D");
        assertThat(SmileFaces.countSmileys(listSmile)).isEqualTo(0);
    }

    @Test
    public void shouldReturn0IfHasSomethingElse() {
        List<String> listSmile = new ArrayList<>();
        listSmile.add("x-]");
        listSmile.add(":ox)");
        assertThat(SmileFaces.countSmileys(listSmile)).isEqualTo(0);
    }

    @Test
    public void shouldNotAcceptDoubleNose() {
        List<String> listSmile = new ArrayList<>();
        listSmile.add(";--)");
        listSmile.add(":~~D");
        listSmile.add(";-~)");
        listSmile.add(":~-D");
        listSmile.add(";-)");
        listSmile.add(":~D");
        assertThat(SmileFaces.countSmileys(listSmile)).isEqualTo(2);
    }

    @Test
    public void test6() {
        List<String> a = new ArrayList<String>();
        a.add(";pD"); a.add("()"); a.add(";--D"); a.add(";pD"); a.add("2:~)"); a.add(":2P"); a.add(";)"); a.add(":P"); a.add(":-))"); a.add("pP");
        a.add(":D"); a.add(";)"); a.add(":x)"); a.add("d:2p"); a.add(":)"); a.add("8~x"); a.add("o~p"); a.add("o)"); a.add(";~)"); a.add("'D");
        a.add("o8X"); a.add("pDD"); a.add(":)"); a.add("(D"); a.add("4-D"); a.add(";)"); a.add("5)"); a.add(";d"); a.add("8D"); a.add(";oP");
        a.add(":D"); a.add(";xx"); a.add("48)"); a.add(":~x"); a.add(":d"); a.add(":))");
        assertEquals(8, SmileFaces.countSmileys(a));

    }

    @Test
    public void test1() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test2() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, SmileFaces.countSmileys(a));
    }

    @Test
    public void test4() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void test5() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(4, SmileFaces.countSmileys(a));
    }
}