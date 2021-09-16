package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int count;
		String text = "We learn java basics as part of java sessions in java week1";

		String[] split = text.split(" ");

		for (int i = 0; i < split.length; i++) {
			count = 0;
			String str1 = split[i];

			for (int j = i + 1; j < split.length - 1; j++) {
				String str2 = split[j];
				if (str1.equalsIgnoreCase(str2)) {
					count++;

				}

			}
			
			if (count<1)
			{
				System.out.print(str1+" ");
			}

		}

	}

}
