package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_443 {
    private final Production63_443 production = new Production63_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}