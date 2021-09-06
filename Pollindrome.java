package week1.day2;

public class Pollindrome {


	public static void main(String[] args) {

		int input = 454;
		int original = input;
		int remainder = 0, sum = 0;

		while (input > 0) {

			remainder = input % 10;
			sum = (sum * 10) + remainder;
			input = input / 10;
		}
		if (sum == original) {
			System.out.println("given number is polindrome  :" + sum);
		} else {
			System.out.println("given number is  not polindrome");
		}

	}

}
