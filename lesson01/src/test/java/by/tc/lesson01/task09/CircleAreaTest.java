package by.tc.lesson01.task09;

import org.junit.Test;

import junit.framework.Assert;

public class CircleAreaTest {

	@Test
	public void testCircleArea01()
	{
		double radius = 3;
		double expected = Math.PI*3*3;
			
		CircleAreaLength obj = new CircleAreaLength();
		double actual = obj.circleArea(radius);
			
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCircleArea02()
	{
		double radius = 12;
		double expected = Math.PI*12*12;
			
		CircleAreaLength obj = new CircleAreaLength();
		double actual = obj.circleArea(radius);
			
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCircleArea03()
	{
		double radius = 9.5;
		double expected = Math.PI*9.5*9.5;
			
		CircleAreaLength obj = new CircleAreaLength();
		double actual = obj.circleArea(radius);
			
		Assert.assertEquals(expected, actual, 1e-12);
	}
	
	@Test
	public void testCircleArea04()
	{
		double radius = 14.57;
		double expected = Math.PI*14.57*14.57;
			
		CircleAreaLength obj = new CircleAreaLength();
		double actual = obj.circleArea(radius);
			
		Assert.assertEquals(expected, actual, 1e-12);
	}
	
	@Test
	public void testCircleArea05()
	{
		double radius = 21.21;
		double expected = Math.PI*21.21*21.21;
			
		CircleAreaLength obj = new CircleAreaLength();
		double actual = obj.circleArea(radius);
			
		Assert.assertEquals(expected, actual, 1e-12);
	}
}
