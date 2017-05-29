package ua.nure.fedirko.Task1;

public class Part3 {

	public static void main(String[] args) {
		System.out.println(isPrime(100000007));
		//System.out.println(isPrimeMillerRabin(100000007, 100));
	}

	// K
	public static boolean isPrime(long number)
	{
		if(number == 2)
			return true;
		if(number % 2 == 0)
			return false;
		for(long i = 3; i <= Math.sqrt(number); i += 2)
		{
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	// D
	public static boolean isPrimeMillerRabin(long number, long k)
	{
		if(number == 2)
			return true;
		if(number % 2 == 0)
			return false;
		
		// n -1 = (2^s)*t
		long t = number - 1;
		long s = 0;
		while(t % 2 == 0)
		{
			s += 1;
			t /= 2;
		}
		
		for(int i = 0; i < k; i++)
		{
			long a = Math.round(Math.random() * (number - 4) + 2);
			long x = modPow(a, t, number);
			
			if(x == 1 || x == number - 1)
			{
				continue;
			}
			
			boolean isBreak = false;
			for(int j = 0; j < s - 1; j++)
			{
				x = modPow(x, 2, number);
				if(x == 1)
					return false;
				if(x == number - 1)
				{
					isBreak = true;
					break;
				}
			}
			if(isBreak)
				continue;
			return false;
		}
		
		return true;
	}
	
	public static long modPow(long number, long n, long p)
	{
		if(n == 0)
			return 1;
		if(n == 1)
			return number % p;
		if(n == 2)
			return ((number % p) * (number % p)) % p;
		else
		{
			if(n % 2 == 0)
				return modPow(modPow(number, n/2, p), 2, p);
			else
				return (modPow(modPow(number, (n - 1)/2, p), 2, p) * (number % p)) % p;
		}
	}
}
