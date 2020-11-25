package by.tc.lesson01.task03;

import junit.framework.Assert;
import org.junit.Test;

public class SquareAreaTest {

	@Test
	public void testSquareArea01()
	{
		double area = 16;
		double expected = 8;
		
		SquareArea obj = new SquareArea();
		double actual = obj.squareArea(area);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSquareArea02()
	{
		double area = 20;
		double expected = 10;
		
		SquareArea obj = new SquareArea();
		double actual = obj.squareArea(area);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSquareArea03()
	{
		double area = 15;
		double expected = 7.5;
		
		SquareArea obj = new SquareArea();
		double actual = obj.squareArea(area);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSquareArea04()
	{
		double area = 20;
		double expected = 10;
		
		SquareArea obj = new SquareArea();
		double actual = obj.squareArea(area);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSquareArea05()
	{
		double area = 11.8;
		double expected = 5.9;
		
		SquareArea obj = new SquareArea();
		double actual = obj.squareArea(area);
		
		Assert.assertEquals(expected, actual);
	}
	
}
