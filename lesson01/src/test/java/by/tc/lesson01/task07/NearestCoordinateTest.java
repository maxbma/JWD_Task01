package by.tc.lesson01.task07;

import org.junit.Assert;
import org.junit.Test;

public class NearestCoordinateTest {

	@Test
	public void testNearestCoord01()
	{
		int A[] = {3,4};
		int B[] = {6,8};
		int expecteds[] = {3,4};
		
		NearestCoordinate obj = new NearestCoordinate();
		int actuals[] = obj.findNearestCoord(A, B);
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testNearestCoord02()
	{
		int A[] = {5,7};
		int B[] = {6,8};
		int expecteds[] = {5,7};
		
		NearestCoordinate obj = new NearestCoordinate();
		int actuals[] = obj.findNearestCoord(A, B);
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testNearestCoord03()
	{
		int A[] = {11,12};
		int B[] = {2,3};
		int expecteds[] = {2,3};
		
		NearestCoordinate obj = new NearestCoordinate();
		int actuals[] = obj.findNearestCoord(A, B);
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testNearestCoord04()
	{
		int A[] = {25,26};
		int B[] = {24,25};
		int expecteds[] = {24,25};
		
		NearestCoordinate obj = new NearestCoordinate();
		int actuals[] = obj.findNearestCoord(A, B);
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testNearestCoord05()
	{
		int A[] = {12,12};
		int B[] = {12,12};
		int expecteds[] = {12,12};
		
		NearestCoordinate obj = new NearestCoordinate();
		int actuals[] = obj.findNearestCoord(A, B);
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
}
