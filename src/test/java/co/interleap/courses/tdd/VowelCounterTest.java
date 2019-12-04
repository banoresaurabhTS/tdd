package co.interleap.courses.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VowelCounterTest {

    @Test
    public void dummy(){}
    
    @Test 
    public void shouldCountZeroWithAnEmptyString(){
        assertEquals(0, new VowelCounter().count(""));
    }
}