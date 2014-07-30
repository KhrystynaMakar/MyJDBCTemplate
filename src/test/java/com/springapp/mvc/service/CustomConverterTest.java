package com.springapp.mvc.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomConverterTest {
    @Test
    public void testFormatName() throws Exception {
        assertEquals("LOLO", CustomConverter.formatName("Lola"));
    }
}
