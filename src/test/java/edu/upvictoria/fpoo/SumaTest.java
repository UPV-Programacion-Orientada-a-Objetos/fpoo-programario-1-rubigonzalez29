package edu.upvictoria.fpoo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumaTest {
    @Test
    public void sumaNegativos(){
        int a=-10;
        int b=-15;
        Suma s = new Suma();
        assertEquals(-25, s.sumar(a,b));
    }
}