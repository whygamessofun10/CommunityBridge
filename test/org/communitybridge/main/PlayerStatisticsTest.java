/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.communitybridge.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iain E. Davis <iain@ruhlendavis.org>
 */
public class PlayerStatisticsTest
{
	private	PlayerStatistics playerStatistics = new PlayerStatistics();

	@Test
	public void testGetGameTimeFormatted()
	{
		playerStatistics.setGameTime(0);
		assertEquals("0 seconds", playerStatistics.getGameTimeFormatted());
	}

//	@Test
//	public void testGetLastOnlineTimeFormatted()
//	{
//		System.out.println("getLastOnlineTimeFormatted");
//		PlayerStatistics instance = new PlayerStatistics();
//		String expResult = "";
//		String result = instance.getLastOnlineTimeFormatted();
//		assertEquals(expResult, result);
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}
//
//	@Test
//	public void testGetCurrentXPFormatted()
//	{
//		System.out.println("getCurrentXPFormatted");
//		PlayerStatistics instance = new PlayerStatistics();
//		String expResult = "";
//		String result = instance.getCurrentXPFormatted();
//		assertEquals(expResult, result);
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}
//
//	@Test
//	public void testGetLifeTicksFormatted()
//	{
//		System.out.println("getLifeTicksFormatted");
//		PlayerStatistics instance = new PlayerStatistics();
//		String expResult = "";
//		String result = instance.getLifeTicksFormatted();
//		assertEquals(expResult, result);
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}
//
}