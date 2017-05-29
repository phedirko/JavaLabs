package ua.nure.fedirko.Task1;

public class Part10 {

	public static void main(String[] args) {
		int[][] arr = getPascalTriangle(100);
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]);
				System.out.print(' ');
			}
			System.out.println();
		}
	}

	static int[][] getPascalTriangle(int n)
	{
		int[][] pascalTriangle = new int [n][];
		for(int i = 0; i < n; i++)
		{
			pascalTriangle[i] = new int [i + 1];
			for(int j = 0; j < i + 1; j++)
			{
				if(j == 0 || j == i)
					pascalTriangle[i][j] = 1;
				else 
					pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
			}
		}
		return pascalTriangle;
	}
}
