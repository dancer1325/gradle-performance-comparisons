package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_118 {
    private final Production38_118 production = new Production38_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}