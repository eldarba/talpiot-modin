package a.matrix;

public class Demo1 {
	
	public static void main(String[] args) {
		
		int[][] x = new int[5][3];
		
		x[3][1] = 20;
		x[1][2] = 7;
		x[1][1] = -30;
		
		System.out.println(x);
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
