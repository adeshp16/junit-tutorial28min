package edu.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void truncate_test_1() {
		
		StringHelper helper=new StringHelper();
		
		//assertEquals(expectedString, actualString);
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	
	
	@Test
	public void truncate_test_2() {
		
		StringHelper helper=new StringHelper();
		
		//assertEquals(expectedString, actualString);
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}

}
