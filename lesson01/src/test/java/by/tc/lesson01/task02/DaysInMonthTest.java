package by.tc.lesson01.task02;

import org.junit.Test;
import junit.framework.Assert;

public class DaysInMonthTest {
	
	@Test
	public void testDaysInMonth01()
	{
		int year = 2020;
		int month = 4;
		
		int expected = 30;
		DaysInMonth obj = new DaysInMonth();
		int actual = obj.daysInMonth(year, month);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDaysInMonth02()
	{
		int year = 2020;
		int month = 2;
		
		int expected = 29;
		DaysInMonth obj = new DaysInMonth();
		int actual = obj.daysInMonth(year, month);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDaysInMonth03()
	{
		int year = 2001;
		int month = 6;
		
		int expected = 30;
		DaysInMonth obj = new DaysInMonth();
		int actual = obj.daysInMonth(year, month);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDaysInMonth04()
	{
		int year = 2003;
		int month = 3;
		
		int expected = 31;
		DaysInMonth obj = new DaysInMonth();
		int actual = obj.daysInMonth(year, month);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDaysInMonth05()
	{
		int year = 2005;
		int month = 2;
		
		int expected = 28;
		DaysInMonth obj = new DaysInMonth();
		int actual = obj.daysInMonth(year, month);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDaysInMonth06()
	{
		int year = 2004;
		int month = 9;
		
		int expected = 30;
		DaysInMonth obj = new DaysInMonth();
		int actual = obj.daysInMonth(year, month);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDaysInMonth07()
	{
		int year = 2004;
		int month = 2;
		
		int expected = 29;
		DaysInMonth obj = new DaysInMonth();
		int actual = obj.daysInMonth(year, month);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDaysInMonth08()
	{
		int year = 2019;
		int month = 11;
		
		int expected = 30;
		DaysInMonth obj = new DaysInMonth();
		int actual = obj.daysInMonth(year, month);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDaysInMonth09()
	{
		int year = 1999;
		int month = 8;
		
		int expected = 31;
		DaysInMonth obj = new DaysInMonth();
		int actual = obj.daysInMonth(year, month);
		
		Assert.assertEquals(expected, actual);
	}
	
}