package week2.day2;

public class ReverseEvenWords {
	public static String temp = "";
	public static String test2 = "";

	public static void main(String[] args) {

		String test = "I am a software tester";

		String[] spt = test.split(" ");

		for (int i = 0; i < spt.length; i++)

		{
			String test1 = spt[i];
			int j = i + 1;
			if (j % 2 == 0)

			{
				char[] chr = test1.toCharArray();

				for (int k = chr.length - 1; k >= 0; k--) {
					temp = temp + chr[k];
				}

				test2 = test2 + " " + temp;
			} else {
				test2 = test2 + " " + test1;
			}

		}
		System.out.println(test2);
	}

}
