package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_107 {
    private final Production27_107 production = new Production27_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}