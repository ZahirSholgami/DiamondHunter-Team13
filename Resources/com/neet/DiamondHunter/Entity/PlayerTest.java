package com.neet.DiamondHunter.Entity;

import static org.junit.Assert.*;
import org.junit.Test;
import com.neet.DiamondHunter.TileMap.TileMap;

/* Zachary Christensen
 * Tests all setters and getters for Player class. */
public class PlayerTest 
{
	Player testPlayer = new Player(new TileMap(1));
	
	@Test
	public void testNumDiamonds()
	{
		assertEquals(0, testPlayer.numDiamonds());
		testPlayer.collectedDiamond();
		testPlayer.collectedDiamond();
		assertEquals(2, testPlayer.numDiamonds());
	}
	
	@Test
	public void testGetTotalDiamonds()
	{
		assertEquals(0, testPlayer.getTotalDiamonds());
		testPlayer.setTotalDiamonds(15);
		assertEquals(15, testPlayer.getTotalDiamonds());
	}
	
	@Test
	public void testGotBoat()
	{
		assertEquals(false, testPlayer.hasBoat());
		testPlayer.gotBoat();
		assertEquals(true, testPlayer.hasBoat());
	}
	
	@Test
	public void testGotAxe()
	{
		assertEquals(false, testPlayer.hasAxe());
		testPlayer.gotAxe();
		assertEquals(true, testPlayer.hasAxe());
	}
	
}
