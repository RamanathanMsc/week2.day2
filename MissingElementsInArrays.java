package week1.day2;

import java.util.Arrays;

public class MissingElementsInArrays {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			i=i+1;
			if (i!=j) {
				System.out.println("Missing number is: "+j);
				break;
			}

			
			
		}

	}

}
