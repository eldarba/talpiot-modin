package a.matrix;

public class Demo2 {
	
	public static void main(String[] args) {
		
		char[][] arr = new char[3][3];
		arr[0][0] = 'X';
		arr[1][1] = 'O';
		arr[2][2] = 'X';
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// print an element
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
