/**
 * 
 */
package com.neet.DiamondHunter.Manager;

import static org.junit.Assert.*;

import org.junit.Test;


public class GameStateManagerTest 
{

	GameStateManager gsm = new GameStateManager();

	@Test
	public void testSetState() throws Exception 
	{
		gsm.setState(0);
		assertEquals(0, gsm.getState());
		gsm.setState(1);
		assertEquals(1, gsm.getState());
		gsm.setState(3);
		assertEquals(3, gsm.getState());
		gsm.setState(999);
		assertEquals(3, gsm.getState());

	}

	@Test
	public void testSetPaused() throws Exception 
	{
		gsm.setPaused(true);
		assertEquals(true, gsm.isPaused());
		gsm.setPaused(false);
		assertEquals(false, gsm.isPaused());
	}

}
