package by.tc.lesson01.task05;

import org.junit.Test;

import junit.framework.Assert;

public class PerfectNumberTest {

	@Test
	public void testPerfectNumber01()
	{
		int number = 28;
		boolean expected = true;
		
		PerfectNumber obj = new PerfectNumber();
		boolean actual = obj.perfectNumber(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPerfectNumber02()
	{
		int number = 6;
		boolean expected = true;
		
		PerfectNumber obj = new PerfectNumber();
		boolean actual = obj.perfectNumber(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPerfectNumber03()
	{
		int number = 11;
		boolean expected = false;
		
		PerfectNumber obj = new PerfectNumber();
		boolean actual = obj.perfectNumber(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPerfectNumber04()
	{
		int number = 358;
		boolean expected = false;
		
		PerfectNumber obj = new PerfectNumber();
		boolean actual = obj.perfectNumber(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPerfectNumber05()
	{
		int number = 945;
		boolean expected = false;
		
		PerfectNumber obj = new PerfectNumber();
		boolean actual = obj.perfectNumber(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPerfectNumber06()
	{
		int number = 8128;
		boolean expected = true;
		
		PerfectNumber obj = new PerfectNumber();
		boolean actual = obj.perfectNumber(number);
		
		Assert.assertEquals(expected, actual);
	}
	
	
}
