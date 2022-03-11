package coreConcepts;

import org.junit.Test;

public class StringOperations
{
	String a = "   Selenium With Java             ";
	String b = "JAVA";
	String c = "Selenium With JAVA               ";
	@Test
	public void basicOperations()
	{
		int len = a.length();
		System.out.println("String length :" + len);
		String aT = a.trim();
		System.out.println("string length after trim :" + aT.length());
		System.out.println("string after trim :" + aT);
		String aL = a.trim().toLowerCase();
		System.out.println("string after lower :" + aL);
		String aU = a.trim().toUpperCase();	
		System.out.println("string after upper :" + aU);
	}
	@Test
	public void subString()
	{
		String a8 = a.trim().substring(8);
		System.out.println("string a8 :" + a8);
		String a08 = a.trim().substring(0, 8);
		System.out.println("string a08 :" + a08);
	}
	@Test
	public void stringEquals()
	{
		//boolean result = a.trim().equals(c.trim());
		//boolean result = a.trim().toLowerCase().equals(c.trim().toLowerCase());
		//boolean result = a.trim().toUpperCase().equals(c.trim().toUpperCase());
		boolean result = a.trim().equalsIgnoreCase(c.trim());
		if(result == true)
		{
			System.out.println("Both the strings are equal");
		}
		else
		{
			System.out.println("Both the strings are not equal");
		}
	}
	@Test
	public void characterAt()  //print all characters
	{
		char mychar = a.trim().charAt(0);
		System.out.println("char at 0 :" + mychar);
		int len = a.trim().length();
		for(int i=0;i<len;i++)
		{
			System.out.println(a.trim().charAt(i));
		}
	}
	@Test
	public void characterAt_findChar()
	{
		int cnt = 0;
		char mychar = a.trim().charAt(0);
		System.out.println("char at 0 :" + mychar);
		int len = a.trim().length();
		for(int i=0;i<len;i++)
		{
			if(a.trim().charAt(i) == 'n')
			{
				cnt++;
				//System.out.println("Char i is there in the main string");
			}
		}
		System.out.println("char  count :" + cnt);
	}
	@Test
	public void stringContains()
	{
		boolean result = a.trim().toLowerCase().contains(b.trim().toLowerCase());
		if(result == true)
		{
			System.out.println("Main string contains the sub string");
		}
		else
		{
			System.out.println("Main string does not contain the sub string");
		}
	}
	//split - array
	
	//Assignment :
	
		//Write a program to find the count of a particular character in the given string
		//Write a program to find a particular character is there in the given string
		//Write a program to replace the character sequence with new sequence in the given string
		//Write a program to replace a character with new character in the given string
		//Write a program to read two strings as inputs and find they are equal are not[Don't use equalIgnorecae ] .

}
