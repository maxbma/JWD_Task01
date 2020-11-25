package by.tc.lesson01.task04;

public class EvenNumbers {

	public boolean evenNumbers(int A, int B, int C, int D)
	{
		int amount_of_even = 0;
		int numbers[] = {A, B, C, D};
		for(int i =0; i < 4; i++)
		{
			if(numbers[i]%2 == 0)
			{
				amount_of_even++;
				if(amount_of_even == 2) return true;
			}
		}
		return false;
	}
}
