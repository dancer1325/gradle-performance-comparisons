package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_34 {
    private final Production37_34 production = new Production37_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}