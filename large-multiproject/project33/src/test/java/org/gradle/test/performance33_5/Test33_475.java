package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_475 {
    private final Production33_475 production = new Production33_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}