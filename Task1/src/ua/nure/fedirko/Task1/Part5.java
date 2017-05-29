package ua.nure.fedirko.Task1;

import java.math.BigInteger;
import java.util.Scanner;

public class Part5 {

	public static void main(String[] args) {
		System.out.println(luckyTicketsCount(6));
		
		/*
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		System.out.println(luckyTicketsCount(n, k));
		in.close();
		*/
	}
	public static int luckyTicketsCount(int n)
	{
		int sum = 0;
		for(double i = Math.pow(10, n - 1); i < Math.pow(10, n); i++)
		{
			int leftSum = 0;
			int rightSum = 0;
			for(int j = 0; j < n; j++)
			{
				if(j < n/2)
					leftSum += (int)(i / Math.pow(10, n - j - 1)) % 10;
				else
					rightSum += (int)(i / Math.pow(10, n - j - 1)) % 10;
			}
			
			if(leftSum == rightSum)
				sum += 1;
		} 
		
		return sum;
	}
	

	/*public static BigInteger luckyTicketsCount(int digitCount, int digitSum)
	{
		if(digitSum % 2 != 0)
			return BigInteger.ZERO;
		
		digitSum /= 2;
		BigInteger[][] array = new BigInteger[digitCount + 1][digitSum + 1];
		array[0][0] = BigInteger.ONE;
		for(int i = 1; i < digitCount + 1; i++)
		{
			for(int j = 0; j < digitSum + 1; j++)
			{
				BigInteger sum = BigInteger.ZERO;
				int startIndex = Math.max(0, j - 9);
				for(int k = startIndex; k < j + 1; k++)
				{
					if(array[i - 1][k] != null)
						sum = sum.add(array[i - 1][k]);
				}
				array[i][j] = sum;
			}
		}
		return array[digitCount][digitSum].multiply(array[digitCount][digitSum]);
	}*/
}
