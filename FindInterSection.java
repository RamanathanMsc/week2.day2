package week1.day2;

public class FindInterSection {

	/*
	 * Pseudo Code
	 * 
	 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
	 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
	 * a nested for another array from 0 to array length e) Compare Both the arrays
	 * using a condition statement
	 * 
	 * f) Print the first array (should match item in both arrays)
	 */
	public static void main(String[] args) {

		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		for (int i = 0; i < arr1.length; i++) {

			int j = arr1[i];

			for (int k = 0; k < arr2.length; k++) {

				int s = arr2[k];

				if (j == s) {
					System.out.println("match item : " + j);
				}
			}

		}
	}

}
