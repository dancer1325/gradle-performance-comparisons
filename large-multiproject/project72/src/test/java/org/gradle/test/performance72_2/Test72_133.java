package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_133 {
    private final Production72_133 production = new Production72_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}