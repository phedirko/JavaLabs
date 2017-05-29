package ua.nure.fedirko.Task1;

public class Part9 {

	public static void main(String[] args) {
		int [][][][][][] arr = getArray();
		for(int a1 = 0; a1 < 2; a1++){
			for(int a2 = 0; a2 < 2; a2++){
				for(int a3 = 0; a3 < 2; a3++){
					for(int a4 = 0; a4 < 2; a4++){
						for(int a5 = 0; a5 < 2; a5++){
							for(int a6 = 0; a6 < 2; a6++){
								System.out.println(arr[a1][a2][a3][a4][a5][a6]);
							}	
						}
					}
				}
			}
		}
	}

	static int[][][][][][] getArray()
	{
		int[][][][][][] arr = new int[2][2][2][2][2][2];
		for(int i = 0; i < 64; i++){
			int a6 = i % 2;
			int a5 = (i >> 1) % 2;
			int a4 = (i >> 2) % 2;
			int a3 = (i >> 3) % 2;
			int a2 = (i >> 4) % 2;
			int a1 = (i >> 5) % 2;
			arr[a1][a2][a3][a4][a5][a6] = i + 1;
		}
		
		return arr;
	}
}
