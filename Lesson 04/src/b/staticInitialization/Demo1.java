package b.staticInitialization;

public class Demo1 {

	public static void main(String[] args) {
		// 2, 4, 6
		int[] arr1 = { 2, 4, 6 };
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		System.out.println("=================");

		String[] mode = { "ON", "OFF", "STAND_BY" };
		System.out.println(mode[0]);
		System.out.println(mode[1]);
		System.out.println(mode[2]);

		System.out.println("=================");
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 10, 20, 30 }, { 100, 200 } };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
