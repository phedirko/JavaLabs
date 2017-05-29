package ua.nure.fedirko.Task1;

import java.math.BigInteger;

public class Part4 {

	public static void main(String[] args) {
		System.out.println(sum(5));
	}
	
	static long sum(int n)
	{
		long factorial = 1;
		long sum = 1;
		for(int i = 2; i <= n; i++){
			factorial *= i;
			if(i % 2 == 0){
				sum -= factorial;
			}
			else{
				sum += factorial;
			}
		}
		
		return sum;
	}
	
	/*static BigInteger sum(long n)
	{
		BigInteger factorial = BigInteger.ONE;
		BigInteger sum = BigInteger.ONE;
		for(int i = 1; i <= n; i++)
		{
			factorial = factorial.multiply(BigInteger.valueOf(i));
			sum = sum.add(factorial);
		}
		
		return sum;
	}*/
}
