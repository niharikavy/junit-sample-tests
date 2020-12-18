package com.nv.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultipleMappedTests {

    @DisplayName("NVPROJ-TC-6,NVPROJ-TC-7,NVPROJ-TC-31")
    @Test
    public void testMultipleKeys() {
        Assertions.assertEquals(1,2, "Verify 1=2");
    }

    //Mapped to NVPROJ-TC-15, NVPROJ-TC-15 and NVPROJ-TC-5 (deprecated)
    @Test
    public void testMultipleAutomationKeys() {
        Assertions.assertEquals(1,2, "Verify 1=2");
    }
}
