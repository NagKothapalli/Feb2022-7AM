package coreConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	//https://github.com/NagKothapalli/Feb2022-7AM.git
	//Decision making statements
	//if , if else , else if , nested if , switch case
	//write a program to read two integers as input and compare the numbers
	
	//Modifier    ReturnType   Name(){  body }
	@Test
	public void compareNumbers_if()
	{
		int a = 22;  // = assignment
		int b = 25;
		//if(expression -> boolean : true / false){  Task - true }
		boolean result = (a==b);  //22==22 ->true
		System.out.println(result);
		if(result == true)   // relational operator
		{
			//Task			
			System.out.println("Both A and B are equal");
		}
	}
	@Test
	public void compareNumbers_ifelse()
	{
		int a = 25;  // = assignment
		int b = 25;
		//if(expression -> boolean : true / false){  Task - true }
		boolean result = (a==b);  //22==22 ->true
		System.out.println(result);
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if(result == true)   // relational operator
		{
			//Task			
			System.out.println("Both A and B are equal");
		}
		else
		{
			System.out.println("Both A and B are not equal");
		}
	}
	@Test
	public void compareNumbers_ifelse_unitTest()   //Unit Testing
	{
		compareNumbers_ifelse(45,88);
		compareNumbers_ifelse(45,45);
	}
	
	public void compareNumbers_ifelse(int a,int b) //Dev code
	{		
		//if(expression -> boolean : true / false){  Task - true }
		boolean result = (a==b);  //22==22 ->true
		System.out.println(result);
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if(result == true)   // relational operator
		{
			//Task			
			System.out.println("Both A and B are equal");
		}
		else
		{
			System.out.println("Both A and B are not equal");
		}
	}

}
