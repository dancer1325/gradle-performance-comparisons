package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_384 {
    private final Production39_384 production = new Production39_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}