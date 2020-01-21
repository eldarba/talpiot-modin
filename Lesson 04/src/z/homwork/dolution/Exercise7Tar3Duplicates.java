package z.homwork.dolution;

import java.util.Arrays;

public class Exercise7Tar3Duplicates {

	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}
		System.out.println(Arrays.toString(arr));

		// how eliminate duplicate elements in the array
		// 1. create a new array
		int[] arrUnique = new int[arr.length];
		// insert only 1 instance of each value
		int newLength = 0;
		lbl: for (int i = 0; i < arr.length; i++) {
			int currElement = arr[i];
			for (int j = 0; j < newLength; j++) {
				if (arrUnique[j] == currElement) {
					// do not add currElement
					continue lbl;
				}
			}
			// if we are here - this is a unique value
			arrUnique[newLength] = currElement;
			newLength++;
		}

		// System.out.println(Arrays.toString(arrUnique));

		int[] temp = new int[newLength];
		// copy arrays
		System.arraycopy(arrUnique, 0, temp, 0, newLength);
		arrUnique = temp;

		System.out.println(Arrays.toString(arrUnique));

	}

}
