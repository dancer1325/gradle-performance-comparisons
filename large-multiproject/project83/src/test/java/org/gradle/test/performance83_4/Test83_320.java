package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_320 {
    private final Production83_320 production = new Production83_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}