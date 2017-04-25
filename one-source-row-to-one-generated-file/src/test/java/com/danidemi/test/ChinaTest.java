package com.danidemi.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChinaTest {

    @Test public void testChina() {
        China china = new China();
        assertEquals( "CH", china.getCode() );
    }

}