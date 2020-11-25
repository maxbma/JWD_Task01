package by.tc.lesson01.task03;

public class SquareArea {
	
	public double squareArea(double area)
	{
		/*
		  d - диаметр
		  S - искомая площадь
		  d = Math.sqrt(area)
		  S = (d^2)/2 = area/2
		 */
		
		return area/2;
	}
	
	public double areasDifference(double area1, double area2)
	{
		if(area1 > area2) return area1/area2;
		else return area2/area1;
	}
	
}
