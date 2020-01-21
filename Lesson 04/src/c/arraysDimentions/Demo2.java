package c.arraysDimentions;

import java.util.Arrays;

public class Demo2 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][];
		
		for (int i = 0; i < arr.length; i++) {
			int length = (int) (Math.random()*11) + 3; // 5 - 15
			arr[i] = new int[length];
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
