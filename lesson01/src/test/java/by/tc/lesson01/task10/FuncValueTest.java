package by.tc.lesson01.task10;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;
import junit.framework.Assert;

public class FuncValueTest {

	@Test
	public void testFuncValue01()
	{
		double a = 2, b = 4, h = 0.2;
		Map <Double, Double> expected = new LinkedHashMap<>();
		for (double x = a; x <=b + h/2; x+=h)
		{
			expected.put(x, Math.tan(x));
		}
		
		FuncValue obj = new FuncValue();
		Map <Double,Double> actual = obj.funcValue(a, b, h);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFuncValue02()
	{
		double a = 1.73, b = 5, h = 0.4;
		Map <Double, Double> expected = new LinkedHashMap<>();
		for (double x = a; x <=b + h/2; x+=h)
		{
			expected.put(x, Math.tan(x));
		}
		
		FuncValue obj = new FuncValue();
		Map <Double,Double> actual = obj.funcValue(a, b, h);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFuncValue03()
	{
		double a = 10.11, b = 12.03, h = 0.2;
		Map <Double, Double> expected = new LinkedHashMap<>();
		for (double x = a; x <=b + h/2; x+=h)
		{
			expected.put(x, Math.tan(x));
		}
		
		FuncValue obj = new FuncValue();
		Map <Double,Double> actual = obj.funcValue(a, b, h);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFuncValue04()
	{
		double a = 4.49, b = 7.49, h = 1;
		Map <Double, Double> expected = new LinkedHashMap<>();
		for (double x = a; x <=b + h/2; x+=h)
		{
			expected.put(x, Math.tan(x));
		}
		
		FuncValue obj = new FuncValue();
		Map <Double,Double> actual = obj.funcValue(a, b, h);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testFuncValue05()
	{
		double a = 2.15, b = 4.35, h = 0.2;
		Map <Double, Double> expected = new LinkedHashMap<>();
		for (double x = a; x <=b + h/2; x+=h)
		{
			expected.put(x, Math.tan(x));
		}
		
		FuncValue obj = new FuncValue();
		Map <Double,Double> actual = obj.funcValue(a, b, h);
		
		Assert.assertEquals(expected, actual);
	}
}
