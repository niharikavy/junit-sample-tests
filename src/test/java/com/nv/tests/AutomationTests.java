package com.nv.tests;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AutomationTests {
    @Test
    public void testMappedAutomationKey() {
        Assertions.assertEquals(1,1, "Verify 1=1");
    }

    @DisplayName("NVPROJ-TC-3")
    @Test
    public void testMappedCaseKey() {
        Assertions.assertEquals(1,2, "Verify 1=2");
    }

    @Test
    @Disabled
    public void testUnmappedKeys() {
        Assertions.assertEquals(1,2, "Verify 1=2");
    }
}
