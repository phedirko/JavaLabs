package ua.nure.fedirko.Task1;

public class Part2 {

	public static void main(String[] args) {
		System.out.println(digitSum(123));
	}
	
	static int digitSum(long number)
	{
		String stringNumber = String.valueOf(number);
		int sum = 0;
		for(int i = 0; i < stringNumber.length(); i++)
		{
			sum += Character.getNumericValue(stringNumber.charAt(i));
		}
		return sum;
	}
}
