package ua.nure.fedirko.Task1;

import java.math.BigInteger;

public class Part1 {

	public static void main(String[] args) {
		System.out.println(gcd(24, 8));
		//System.out.println(gcd(BigInteger.valueOf(24), BigInteger.valueOf(7)));
	}

	//K
	private static long gcd(long x, long y)
	{
		if(x==0)
			return y;
		if(y==0)
			return x;
		return gcd(Math.abs(x-y), Math.min(x, y));
	}



	//D
	/*private static BigInteger gcd(BigInteger x, BigInteger y)
	{
		// return x.gcd(y)
		
		if(x.compareTo(y) > 0)
		{
			if(y==BigInteger.ZERO)
				return x;
			return gcd(y,x.subtract(y));
		}
		if(x==BigInteger.ZERO)
			return y;
		return gcd(x,y.subtract(y));
	}*/
}
