package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String test = "feeling good";
		
		char[] chr=test.toCharArray();
		
	int	length=chr.length;
	
	for (int i = length-1; i >= 0; i--) 
	{
		char s=chr[i];
		System.out.print(s);
	}

	}

}
