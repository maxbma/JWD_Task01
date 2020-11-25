package by.tc.lesson01.task02;

public class DaysInMonth {
	
	public int daysInMonth(int year, int month)
	{
		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(leapYear(year)) days[1] = 29;
		return days[month-1];
	}
	
	public boolean leapYear(int year)
	{
		if(year%4 == 0) return true;
		else return false;
	}
	
}
