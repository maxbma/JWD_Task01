package by.tc.lesson01.task01;

import org.junit.Test;

import junit.framework.Assert;

public class LastNumberTest {
	
	
	@Test
	public void testLastNumber01()
	{
		int x = 0; 	
		int expected = 0;
	
		LastNumber obj = new LastNumber();
		int actual = obj.lastNumber(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLastNumber02()
	{
		int x = 1; 	
		int expected = 1;
	
		LastNumber obj = new LastNumber();
		int actual = obj.lastNumber(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLastNumber03()
	{
		int x = 2; 	
		int expected = 4;
	
		LastNumber obj = new LastNumber();
		int actual = obj.lastNumber(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLastNumber04()
	{
		int x = 3; 	
		int expected = 9;
	
		LastNumber obj = new LastNumber();
		int actual = obj.lastNumber(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLastNumber05()
	{
		int x = 4; 	
		int expected = 6;
	
		LastNumber obj = new LastNumber();
		int actual = obj.lastNumber(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLastNumber06()
	{
		int x = 5; 	
		int expected = 5;
	
		LastNumber obj = new LastNumber();
		int actual = obj.lastNumber(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLastNumber07()
	{
		int x = 6; 	
		int expected = 6;
	
		LastNumber obj = new LastNumber();
		int actual = obj.lastNumber(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLastNumber08()
	{
		int x = 7; 	
		int expected = 9;
	
		LastNumber obj = new LastNumber();
		int actual = obj.lastNumber(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLastNumber09()
	{
		int x = 8; 	
		int expected = 4;
	
		LastNumber obj = new LastNumber();
		int actual = obj.lastNumber(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testLastNumber10()
	{
		int x = 9; 	
		int expected = 1;
	
		LastNumber obj = new LastNumber();
		int actual = obj.lastNumber(x);
		
		Assert.assertEquals(expected, actual);
	}
	
}
