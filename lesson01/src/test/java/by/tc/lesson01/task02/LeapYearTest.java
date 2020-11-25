package by.tc.lesson01.task02;

import org.junit.Test;

import junit.framework.Assert;

public class LeapYearTest {
	
	@Test
	public void testLeapYear01()
	{
		int year = 2020;
		boolean expected = true;
		
		DaysInMonth obj = new DaysInMonth();
		boolean actual = obj.leapYear(year);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLeapYear02()
	{
		int year = 2002;
		boolean expected = false;
		
		DaysInMonth obj = new DaysInMonth();
		boolean actual = obj.leapYear(year);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLeapYear03()
	{
		int year = 2019;
		boolean expected = false;
		
		DaysInMonth obj = new DaysInMonth();
		boolean actual = obj.leapYear(year);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLeapYear04()
	{
		int year = 1991;
		boolean expected = false;
		
		DaysInMonth obj = new DaysInMonth();
		boolean actual = obj.leapYear(year);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLeapYear05()
	{
		int year = 1976;
		boolean expected = true;
		
		DaysInMonth obj = new DaysInMonth();
		boolean actual = obj.leapYear(year);
		
		Assert.assertEquals(expected, actual);
	}
}
