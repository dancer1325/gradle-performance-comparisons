package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_440 {
    private final Production6_440 production = new Production6_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}