package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_146 {
    private final Production32_146 production = new Production32_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}