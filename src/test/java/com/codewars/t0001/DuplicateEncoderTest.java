package com.codewars.t0001;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(
                ")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized")
        );
        assertEquals(
                "))))())))",
                DuplicateEncoder.encode("   ()(   ")
        );
    }
}
