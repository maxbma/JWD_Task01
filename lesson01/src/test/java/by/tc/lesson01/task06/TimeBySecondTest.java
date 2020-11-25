package by.tc.lesson01.task06;

import org.junit.Assert;
import org.junit.Test;

public class TimeBySecondTest {

	@Test
	public void testTimeBySecond01()
	{
		int seconds = 75;
		int expecteds[] = {0, 1, 15};
		
		TimeBySecond obj = new TimeBySecond();
		int actuals[] = obj.determineTime(seconds);
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testTimeBySecond02()
	{
		int seconds = 1256;
		int expecteds[] = {0, 20, 56};
		
		TimeBySecond obj = new TimeBySecond();
		int actuals[] = obj.determineTime(seconds);
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testTimeBySecond03()
	{
		int seconds = 15260;
		int expecteds[] = {4, 14, 20};
		
		TimeBySecond obj = new TimeBySecond();
		int actuals[] = obj.determineTime(seconds);
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testTimeBySecond04()
	{
		int seconds = 30000;
		int expecteds[] = {8, 20, 0};
		
		TimeBySecond obj = new TimeBySecond();
		int actuals[] = obj.determineTime(seconds);
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testTimeBySecond05()
	{
		int seconds = 79199;
		int expecteds[] = {21, 59, 59};
		
		TimeBySecond obj = new TimeBySecond();
		int actuals[] = obj.determineTime(seconds);
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
}
