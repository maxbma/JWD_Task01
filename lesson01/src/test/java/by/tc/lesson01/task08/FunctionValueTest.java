package by.tc.lesson01.task08;

import org.junit.Test;

import junit.framework.Assert;

public class FunctionValueTest {

	@Test
	public void testFunctionValue01()
	{
		double x = 4;
		double expected = 5;
		
		FunctionValue obj = new FunctionValue();
		double actual = obj.functionValue(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFunctionValue02()
	{
		double x = 3;
		double expected = 9;
		
		FunctionValue obj = new FunctionValue();
		double actual = obj.functionValue(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFunctionValue03()
	{
		double x = 1;
		double expected = -1/5.;
		
		FunctionValue obj = new FunctionValue();
		double actual = obj.functionValue(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFunctionValue04()
	{
		double x = -3;
		double expected = -1/33.;
		
		FunctionValue obj = new FunctionValue();
		double actual = obj.functionValue(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFunctionValue05()
	{
		double x = 20;
		double expected = -331;
		
		FunctionValue obj = new FunctionValue();
		double actual = obj.functionValue(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFunctionValue06()
	{
		double x = -11;
		double expected = -1/1337.;
		
		FunctionValue obj = new FunctionValue();
		double actual = obj.functionValue(x);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFunctionValue07()
	{
		double x = 5.5;
		double expected = -4.75;
		
		FunctionValue obj = new FunctionValue();
		double actual = obj.functionValue(x);
		
		Assert.assertEquals(expected, actual);
	}
}
