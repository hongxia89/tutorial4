package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestSubtraction {
    @Test
    public void Subtract(){
        Calc c = new Calc();
        assertEquals(2, c.subtract(4,2));
    }
}