package by.tc.lesson01.task10;

import java.util.LinkedHashMap;
import java.util.Map;

public class FuncValue {
	
	public Map<Double, Double> funcValue(double a, double b, double h )
	{ 
		Map<Double,Double> value = new LinkedHashMap<>();
		for(double x = a; x <=b + h/2; x+=h)
		{
			value.put(x, Math.tan(x));
		}
		return value;
	}
	
	public void outputTable(Map <Double,Double>actual, double x, double h)
	{
		for(int i=0; i < actual.size(); i++)
		{
			System.out.println(x + " | " + actual.get(x));
		}
	}
}
