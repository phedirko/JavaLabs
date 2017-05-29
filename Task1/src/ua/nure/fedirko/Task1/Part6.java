package ua.nure.fedirko.Task1;

public class Part6 {

	public static void main(String[] args) {
		int[] row = fibRow(7);
		for(int i = 0; i < row.length; i++)
		{
			System.out.println(row[i]);
		}
		
		//System.out.println(fibModPrime(8, 100000007));
	}
	
	public static int[] fibRow(int n)
	{
		int[] row = new int[n];
		row[0] = 1;
		row[1] = 1;
		for(int i = 2; i < n; i++)
		{
			row[i] = row[i-2] + row[i-1];
		}
		
		return row;
	}
	
	/*public static long fibModPrime(long fibCount, long p)
	{
		long[][] matrix = new long [2][2];
		matrix[0][0] = 1;
		matrix[0][1] = 1;
		matrix[1][0] = 1;
		matrix[1][1] = 0;
		long[][] newMatrix = powMatrix(matrix, fibCount, p);
		return newMatrix[0][1];
	}
	
	public static long[][] powMatrix(long[][] a, long n, long p)
	{
		if(n == 1)
		{
			return a;
		}
		if(n == 2)
		{
			return matrixMultiply(a, a, p);
		}
		else
		{
			if(n % 2 == 0)
			{
				// �������� � n/2.
				return powMatrix(powMatrix(a, n/2, p), 2, p);
			}
			else
			{
				// �������� � (n-1)/2 � �������� �� �.
				return matrixMultiply(powMatrix(powMatrix(a, (n - 1) / 2, p), 2, p), a, p);
			}
		}
	}
	
	public static long[][] matrixMultiply(long[][] a, long[][] b, long p)
	{
		if(a[0].length == b.length)
		{
			long[][] c = new long[a.length][b[0].length];
		
			for(int i = 0; i < c.length; i++)
			{
				for(int j = 0; j < c[i].length; j++)
				{
					for(int k = 0; k < b.length; k++)
					{
						c[i][j] += (a[i][k] % p) * (b[k][j] % p);
						c[i][j] %= p;
					}
				}
			}
			return c;
		}
		else
		{
			return null;
		}
	}*/
}
