package org.example;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void testSumar(){
        Example example = new Example();

        int result = example.sumar(4,4);
        assertEquals(15, result);
    }
}
