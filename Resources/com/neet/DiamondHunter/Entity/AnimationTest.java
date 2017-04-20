package com.neet.DiamondHunter.Entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimationTest {
	Animation ani = new Animation();

	@Test
	public void testSetDelay()
	{
		ani.setDelay(10);
		assertEquals(10, ani.getDelay());
		ani.setDelay(20);
		assertEquals(20, ani.getDelay());
		ani.setDelay(12312321);
		assertEquals(12312321, ani.getDelay());
	}

	@Test
	public void testSetFrame() 
	{
		ani.setFrame(1);
		assertEquals(1, ani.getFrame());
		ani.setFrame(123);
		assertEquals(123, ani.getFrame());
	}

	@Test
	public void testGetFrame()
	{
		ani.setFrame(123);
		assertEquals(123, ani.getFrame());
	}

	@Test
	public void testGetCount()  
	{
		assertEquals(0, ani.getCount());
	}
	
	//Maguire Test
	@Test
	public void testSetNumFrames()
	{
		ani.setNumFrames(3);
		assertEquals(3,ani.getFrames());
		ani.setNumFrames(0);
		assertEquals(0,ani.getFrames());
		ani.setNumFrames(2341241);
		assertEquals(2341241,ani.getFrames());
	}
}
