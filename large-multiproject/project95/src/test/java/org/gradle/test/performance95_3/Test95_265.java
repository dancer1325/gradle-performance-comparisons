package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_265 {
    private final Production95_265 production = new Production95_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}