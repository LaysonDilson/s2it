package br.com.s2it.questions;

import org.junit.Test;

import static org.junit.Assert.*;

public class EightTest {

    @Test
    public void concatByPosition() {
        var a =555;
        var b =1;
        assertEquals(Integer.valueOf(5155),Eight.concatByPosition(a,b));
    }

    @Test
    public void concatByPositionGreaterThenOneMilion() {
        var a =10256;
        var b =512;
        assertEquals(Integer.valueOf(-1),Eight.concatByPosition(a,b));
    }
}