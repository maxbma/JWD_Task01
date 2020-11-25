package by.tc.lesson01.task08;

public class FunctionValue {

	public double functionValue(double x)
	{
		double func;
		if(x >= 3)
		{
			func = -(Math.pow(x, 2)) + 3*x + 9; 
		}
		else func = 1/(Math.pow(x, 3) - 6);
		return func;
	}
}
