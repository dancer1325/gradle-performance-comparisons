package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_195 {
    private final Production94_195 production = new Production94_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}