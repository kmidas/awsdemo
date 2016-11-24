package org.midas.basicsort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasicStringSortTest {
	
	BasicStringSort basicStringSort = new BasicStringSort();

	@Test
	public void testShowStuff()
	{
		String name = "baba";
		String returnVal = basicStringSort.showStuff(name); 
		assertEquals(returnVal, "Hello baba");
		
	}
	

}
