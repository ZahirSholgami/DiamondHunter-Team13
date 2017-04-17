package com.neet.DiamondHunter.Manager;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.Test;

public class KeysTest 
{
	@Test
	public void testKeySet()
	{
		Keys.keySet(KeyEvent.VK_UP, true);
		assertEquals(true, Keys.anyKeyDown());
		assertEquals(true, Keys.anyKeyPress());
		Keys.keySet(KeyEvent.VK_UP, false);
		assertEquals(false, Keys.anyKeyDown());
		assertEquals(false, Keys.anyKeyPress());
	}

	@Test
	public void testIsPressed()
	{
		Keys.keySet(KeyEvent.VK_F1, true);
		assertEquals(true, Keys.isDown(7));
		assertEquals(true, Keys.isPressed(7));
		Keys.keySet(KeyEvent.VK_F1, false);
		assertEquals(false, Keys.isDown(7));
		assertEquals(false, Keys.isPressed(7));
		
		Keys.keySet(KeyEvent.VK_UP, true);
		assertEquals(true, Keys.isDown(0));
		assertEquals(true, Keys.isPressed(0));
		Keys.keySet(KeyEvent.VK_UP, false);
		assertEquals(false, Keys.isDown(0));
		assertEquals(false, Keys.isPressed(0));
	}


}