package a.matrix;

public class Demo3 {

	public static void main(String[] args) {

		int[][] arr = new int[10][6];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// insert a random value to the array
				arr[i][j] = (int) (Math.random() * 10);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
