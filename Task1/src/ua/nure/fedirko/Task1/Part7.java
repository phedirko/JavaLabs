package ua.nure.fedirko.Task1;

public class Part7 {

	public static void main(String[] args) {
		int[] arr = getPrimeNumbers(10);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static int[] getPrimeNumbers(int n)
	{
		int[] primes = new int[n];
		primes[0] = 2;
		primes [1] = 3;

		int number = 5;
		for(int i = 2; i < n ; )
		{
			boolean isPrime = true;
			for(int j = 0; j < i; j++)
			{
				if(number % primes[j] == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime)
			{
				primes[i] = number;
				i++;
			}
			
			number += 2;
		}
		
		return primes;
	}
}
