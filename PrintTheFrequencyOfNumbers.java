package week1.day2;

import java.util.Arrays;



public class PrintTheFrequencyOfNumbers {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };

		int length = arr.length;
		int r=0;
		Arrays.sort(arr);

		for (int i = 0; i < length; i++) {

			int count = 1;

			int s = arr[i];
			
		if(i!=length-1)
			if(arr[i]==arr[i+1])
			continue;
			
			for (int j = 1; j < length - 1; j++) {

				r = arr[j];

				if (r == s) {
					count++;
					
				}

			}

			System.out.println(s + " Occur " + count + "  times");

		}

	}

}
