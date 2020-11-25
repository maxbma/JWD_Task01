package by.tc.lesson01.task09;

import org.junit.Test;

import junit.framework.Assert;

public class CircleLengthTest {

	@Test
	public void testCircleLength01()
	{
		double radius = 3;
		double expected = 3*2*Math.PI;
		
		CircleAreaLength obj = new CircleAreaLength();
		double actual = obj.circleLength(radius);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCircleLength02()
	{
		double radius = 8;
		double expected = 8*2*Math.PI;
		
		CircleAreaLength obj = new CircleAreaLength();
		double actual = obj.circleLength(radius);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCircleLength03()
	{
		double radius = 13.5;
		double expected = 13.5*2*Math.PI;
		
		CircleAreaLength obj = new CircleAreaLength();
		double actual = obj.circleLength(radius);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCircleLength04()
	{
		double radius = 5.38;
		double expected = 5.38*2*Math.PI;
		
		CircleAreaLength obj = new CircleAreaLength();
		double actual = obj.circleLength(radius);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCircleLength05()
	{
		double radius = 18.72;
		double expected = 18.72*2*Math.PI;
		
		CircleAreaLength obj = new CircleAreaLength();
		double actual = obj.circleLength(radius);
		
		Assert.assertEquals(expected, actual);
	}
}
