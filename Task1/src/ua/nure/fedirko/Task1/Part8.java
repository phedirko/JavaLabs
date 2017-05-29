package ua.nure.fedirko.Task1;

public class Part8 {

	public static void main(String[] args) {
		char[][] arr = getChessBoard(3,5);
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static char[][] getChessBoard(int n, int m)
	{
		char[][] desk = new char[n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				if((i + j) % 2 == 0)
					desk[i][j] = 'Ч';
				else
					desk[i][j] = 'Б';
			}
		}
		
		return desk;
	}
}
