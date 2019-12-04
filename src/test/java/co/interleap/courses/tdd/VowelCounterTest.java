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
    
    @Test 
    public void countSingleVowel() {
    	assertEquals(1, new VowelCounter().count("u"));
    }
    
    @Test
    public void allVowels(){
    	assertEquals(5,new VowelCounter().count("aeiou"));
    }
    
    @Test
    public void genericString() {
        assertEquals(3,new VowelCounter().count("yhdgreei"));
    }
    
    @Test
    public void noVowel() {
        assertEquals(0,new VowelCounter().count("yhdgrmmm"));
    }
    
    
}