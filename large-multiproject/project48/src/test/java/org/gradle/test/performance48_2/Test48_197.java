package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_197 {
    private final Production48_197 production = new Production48_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}