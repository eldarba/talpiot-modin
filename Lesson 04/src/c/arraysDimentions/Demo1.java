package c.arraysDimentions;

public class Demo1 {
	
	public static void main(String[] args) {
		
		// declaration of a varible + assignment
		// 1. type is int
		// 2. identifier is x
		// 3. assign value
		int x = 5;
		
		// declaration of a varible + assignment
		// 1. type is int[]
		// 2. identifier is arr
		// 3. assign value
		int[] arr = new int[25];
		
		// create 2 dim array - each array in 2D is of different length
		int[][] arrDim = new int[5][];
		
		arrDim[0] = new int[20];
		arrDim[1] = new int[5];
		arrDim[2] = new int[12];
		arrDim[3] = new int[100];
		arrDim[4] = new int[3];
		
		for (int i = 0; i < arrDim.length; i++) {
			for (int j = 0; j < arrDim[i].length; j++) {
				System.out.print(arrDim[i][j] + ", ");
			}
			System.out.println();
		}
		
		
	}

}
