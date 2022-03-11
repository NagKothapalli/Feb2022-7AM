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
	
	//write a program to read two integers as input and perform sum them if equal if not do subtraction
	@Test
	public void decisionMaking_unitTest() //TDD : Test Driven Development
	{
		decisionMaking(55,55); // use case / test case  5 / 10 = 50 %
		decisionMaking(545,55);
	}
	public void decisionMaking(int a,int b)
	{
		if(a == b) //22==22 -> true  22==42  -> false
		{
			//true
			int sum = a+b;
			System.out.println("Sum of two numbers :" + sum);
		}
		else
		{
			int diff = a-b;
			System.out.println("Difference of two numbers :" + diff);
		}
		
		System.out.println("just continue");
		
	}
	//write a program to read two integers as input and perform sum them if equal 
	//if a > b do subtraction  , do multiplication a < b
	@Test
	public void workWithElseif_unitTest()
	{
		workWithElseif(44,44); //33 %   5/15 *100 = 33.333
		workWithElseif(66,66); //duplicate test case
		workWithElseif(66,26); //33%
		workWithElseif(66,126);
	}
	public void workWithElseif(int a,int b) //dev code - implementation
	{
		System.out.println("A  value :" + a);
		System.out.println("B value :"+ b);
		if(a==b)
		{
			int sum = a+b;
			System.out.println("Sum of two numbers :" + sum);
		}
		else if(a > b)
		{
			int diff = a-b;
			System.out.println("Difference of two numbers :" + diff);
		}
		else if(a<b)
		{
			int prod = a*b;
			System.out.println("Product of two numbers :" + prod);
		}
	}
	//write a program to read two integers as input and perform the below task if and only if first number is above 10
	//Task : sum them if equal if a > b do subtraction  , do multiplication a < b
	public void nestedIfCondition(int a,int b)
	{
		System.out.println("Your A value :"+a);
		System.out.println("Your B value :"+b);
		//Algorithm -> Flowchart -> Program
		if(a>10) //6 - false 24 ->true  // condition -1 
		{
			if(a==b)  //condition-2  Nested if condition
			{
				int sum = a+b;
				System.out.println("Sum of numbers :" + sum);
			}
			else if(a>b)
			{
				int diff = a-b;
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(a<b)
			{
				int prod = a*b;
				System.out.println("Product of two numbers :" + prod);
			}
		}
		else
		{
			System.out.println("Your A value is not above 10");
		}
	}
	@Test
	public void nestedIfCondition_test()
	{
		nestedIfCondition(8,18);
		nestedIfCondition(18,12);
		nestedIfCondition(18,132);
		nestedIfCondition(18,18);
		nestedIfCondition(8,12);
	}
	//write a program to read a number and find that number is even or odd.
	@Test
	public void findEvenOdd_test()
	{
		findEvenOdd(345);
		findEvenOdd(244);
	}
	public void findEvenOdd(int num)  // num / 2 = Q    num % 2  = R   if R == 0 then even
	{
		System.out.println("Given Number :" + num);
		int rem = num % 2 ;
		if(rem == 0)
		{
			System.out.println("Given Number is EVEN");
		}
		else
		{
			System.out.println("Given Number is ODD");
		}
	}
	//write a program to read two integers as input and perform the below task if and only if both are above 10
		//Task : sum them if equal if a > b do subtraction  , do multiplication a < b
	
	public void logicalOperator(int a,int b)
	{
		System.out.println("Your A value :" + a);
		System.out.println("Ypur B value :" + b);
		if((a>10) && (b>10))  // T  and T : T   // && - logical operator
		{
			if(a==b)  //condition-2  Nested if condition
			{
				int sum = a+b;
				System.out.println("Sum of numbers :" + sum);
			}
			else if(a>b)
			{
				int diff = a-b;
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(a<b)
			{
				int prod = a*b;
				System.out.println("Product of two numbers :" + prod);
			}
		}
		else
		{
			System.out.println("Both might be below 10 , any one of them might be below 10");
		}
	}
	@Test
	public void logicalOperator_test()
	{
		logicalOperator(7,4);
		logicalOperator(7,14);
		logicalOperator(17,4);
		logicalOperator(17,17);
		logicalOperator(17,14);
		logicalOperator(17,24);
		
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
	
	//Assignment :
		//Write a program to read two input numbers , perform addition if they are equal ,do subtraction if they are not equal
		//Write a program to read a number and decide that number is even or not
		//Write a program to read two input numbers and perform the below task if and only if both inputs are above 10	
			//Task : perform addition if they are equal ,do subtraction if a>b , do multiplication if a<b
		//Write the above program using switch case
		//Write a program to read two input numbers , perform addition if they are equal ,do subtraction if a>b , do multiplication if a<b		
			

}
