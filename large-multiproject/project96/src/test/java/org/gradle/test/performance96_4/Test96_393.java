package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_393 {
    private final Production96_393 production = new Production96_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}