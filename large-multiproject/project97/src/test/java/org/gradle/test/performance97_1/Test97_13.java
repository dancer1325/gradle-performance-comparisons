package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_13 {
    private final Production97_13 production = new Production97_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}