package by.tc.lesson01.task04;

import org.junit.Test;

import junit.framework.Assert;

public class EvenNumbersTest {

	@Test
	public void testEvenNumbers01()
	{
		int A = 1, B = 2, C = 3, D = 4;
		boolean expected = true;
		
		EvenNumbers obj = new EvenNumbers();
		boolean actual = obj.evenNumbers(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEvenNumbers02()
	{
		int A = 1, B = 3, C = 5, D = 9;
		boolean expected = false;
		
		EvenNumbers obj = new EvenNumbers();
		boolean actual = obj.evenNumbers(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEvenNumbers03()
	{
		int A = 1, B = 2, C = 3, D = 7;
		boolean expected = false;
		
		EvenNumbers obj = new EvenNumbers();
		boolean actual = obj.evenNumbers(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEvenNumbers04()
	{
		int A = 1, B = 11, C = 3, D = 4;
		boolean expected = false;
		
		EvenNumbers obj = new EvenNumbers();
		boolean actual = obj.evenNumbers(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEvenNumbers05()
	{
		int A = 8, B = 2, C = 3, D = 4;
		boolean expected = true;
		
		EvenNumbers obj = new EvenNumbers();
		boolean actual = obj.evenNumbers(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEvenNumbers06()
	{
		int A = 12, B = 2, C = 6, D = 4;
		boolean expected = true;
		
		EvenNumbers obj = new EvenNumbers();
		boolean actual = obj.evenNumbers(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testEvenNumbers07()
	{
		int A = 1, B = 3, C = 26, D = 4;
		boolean expected = true;
		
		EvenNumbers obj = new EvenNumbers();
		boolean actual = obj.evenNumbers(A, B, C, D);
		
		Assert.assertEquals(expected, actual);
	}
	
}
