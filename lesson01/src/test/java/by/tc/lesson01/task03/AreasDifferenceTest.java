package by.tc.lesson01.task03;

import junit.framework.Assert;
import org.junit.Test;

public class AreasDifferenceTest {
	
	@Test
	public void testDifference01()
	{
		double area1 = 20;
		double expected = 2;
		
		SquareArea obj = new SquareArea();
		double area2 = obj.squareArea(area1);
		double actual = obj.areasDifference(area1, area2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDifference02()
	{
		double area1 = 385;
		double expected = 2;
		
		SquareArea obj = new SquareArea();
		double area2 = obj.squareArea(area1);
		double actual = obj.areasDifference(area1, area2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDifference03()
	{
		double area1 = 144;
		double expected = 2;
		
		SquareArea obj = new SquareArea();
		double area2 = obj.squareArea(area1);
		double actual = obj.areasDifference(area1, area2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDifference04()
	{
		double area1 = 1.5;
		double expected = 2;
		
		SquareArea obj = new SquareArea();
		double area2 = obj.squareArea(area1);
		double actual = obj.areasDifference(area1, area2);
		
		Assert.assertEquals(expected, actual);
	}
}
