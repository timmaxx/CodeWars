package com.codewars.t0016_DecodeTheMorseCodeAdvanced;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() throws Exception {
        assertThat(MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(
                "1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")), is("HEY JUDE"));
    }
}