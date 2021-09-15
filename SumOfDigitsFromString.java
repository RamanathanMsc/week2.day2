package week2.day2;

public class SumOfDigitsFromString {
	
	public static	String text = "Tes12Le79af65";
	
	public static int sum=0;
	
	
	

	public static void main(String[] args) {
		

		method1();
		method2();

	}
	
	public static void method2()
	{
		sum=0;
	char[] chr=text.toCharArray();
		
		for (int i = 0; i < chr.length; i++) 
		
		{
			char s=chr[i];
			if(Character.isDigit(s))
			{
				int numericValue = Character.getNumericValue(s);
				sum=sum+numericValue;
			}
			
			
		}
		System.out.println(sum);
	}
	
	public static void method1()
	{
		
		
		String str1 = text.replaceAll("[\\D]", "");
		
		System.out.println(str1);
		
		char[] chr1=str1.toCharArray();
		
		for (int i = 0; i < chr1.length; i++) 
		{
			char s=chr1[i];
			
			int number=Character.getNumericValue(s);
			
			sum=sum+number;
			
		}
		
		System.out.println(sum);
		
	}

}
