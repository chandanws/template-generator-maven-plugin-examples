package com.danidemi.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EuropeTest {

    @Test
    public void europeShouldContainsEuropeanCountries() {
        List<String> strings = Arrays.asList(new Europe().countries);
        assertTrue( strings.contains("Italy") );
        assertTrue( strings.contains("France") );
        assertTrue( strings.contains("Spain") );
        assertFalse( strings.contains("China") );

    }

}