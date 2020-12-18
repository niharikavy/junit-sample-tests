package com.nv.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FailedImportTests {
    @DisplayName("NVPROJ-TC-2123123")
    @Test
    public void testInvalidKey() {
        Assertions.assertEquals(1,1, "Verify 1=1");
    }

    @DisplayName("NVPROJ-TC-2")
    @Test
    public void testUnderReviewCase() {
        Assertions.assertEquals(1,2, "Verify 1=2");
    }

    @Test
    public void testUnmappedKeys() {
        Assertions.assertEquals(1,2, "Verify 1=2");
    }
}
