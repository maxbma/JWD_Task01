package by.tc.lesson01.task06;

public class TimeBySecond {

	public int[] determineTime(int current_seconds)
	{
		int seconds = current_seconds%60;
		int minutes = (current_seconds/60)%60;
		int hours = current_seconds/3600;
		int time[] = {hours, minutes, seconds};
		return time;
	}
}
