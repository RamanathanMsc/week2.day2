package week1.day2;

/*
 * Goal: To find whether a number is an Armstrong number or not
 * 
 * inputs: 153
 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
 * 
 * Shortcuts:
 * 1) Print : type: syso, followed by: ctrl + space + enter
 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
 *   
 * What are my learnings from this code?
 * 1)while loop
 * 2)logical thinking
 * 3) if else loop
 * 
 */
public class AmsStorngNumber {

	public static void main(String[] args) {

		int input = 153;
		int original = input;
		int remainder = 0, quotionent, Calculated = 0;

		while (input > 0) {
			remainder = input % 10;
			quotionent = input / 10;
			Calculated = Calculated + (remainder * remainder * remainder);
			input = quotionent;
		}

		System.out.println(Calculated);

		if (original == Calculated) {
			System.out.println("Given number is amsstorng number");

		} else {
			System.out.println("Given number is not amsstorng number");
		}
	}

}
