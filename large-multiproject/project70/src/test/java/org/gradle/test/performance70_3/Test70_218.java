package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_218 {
    private final Production70_218 production = new Production70_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}