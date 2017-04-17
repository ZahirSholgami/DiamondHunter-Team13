package com.neet.DiamondHunter.Manager;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {

	@Test
	public void testSetTime()
	{
		Data.setTime(1);
		assertEquals(1, Data.getTime());
		Data.setTime(99999999);
		assertEquals(99999999, Data.getTime());
		Data.setTime(24123);
		assertEquals(24123, Data.getTime());
		Data.setTime(0);
		assertEquals(0, Data.getTime());
	}

}
