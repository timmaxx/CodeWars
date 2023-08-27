package com.codewars.t0015_DecodeTheMorseCode;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
//import static org.junit.Assert.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        // assertThat // org.junit.Assert.assertThat
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));

        assertThat(MorseCodeDecoder.decode("... --- ..."), is("SOS"));

        assertThat(MorseCodeDecoder.decode(" ."), is("E"));
    }
}