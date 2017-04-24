package com.danidemi.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountryTest {

    @Test public void useCountries() {
        assertEquals("China", Country.China.toString());
    }

}
