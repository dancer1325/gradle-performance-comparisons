package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_453 {
    private final Production49_453 production = new Production49_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}