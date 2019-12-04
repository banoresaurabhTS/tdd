package co.interleap.courses.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class CabServiceTest {


	
	@Test 
	public void basicTest() {
		CabStatement cabStatement = new CabStatement();
		assertEquals(32, cabStatement.fare(3, 2), 0.1);
	}

}
