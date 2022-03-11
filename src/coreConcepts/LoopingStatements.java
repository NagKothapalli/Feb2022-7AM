package coreConcepts;

import org.junit.Test;

public class LoopingStatements
{
	@Test
	public void printTenNumbers()
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");		
	}
	@Test
	public void applyColor()  //starting point , how long , step size
	{
		System.out.println("Apply color to step 1");
		System.out.println("Apply color to step 2");
		System.out.println("Apply color to step 3");
		System.out.println("Apply color to step 4"); //...................
	}
	////starting point , how long , step size
	// for(iterator = 1 ; condition ; step size )  {    Task    } 
	@Test
	public void applyColorToSteps()
	{
		for(int iterator=1; iterator<=50 ; iterator=iterator+1)  // 1<50 2<50 ...49<50 50<=50
		{
			//Task
			System.out.println("Apply Color to Step:" + iterator);
		}
	}
	
	@Test
	public void applyRedColorToOddSteps()
	{
		for(int iterator=1; iterator<=50 ; iterator=iterator+2)  // 1<50 2<50 ...49<50 50<=50
		{
			//Task
			System.out.println("Apply Color to Odd Steps:" + iterator);
		}
	}
	
	@Test
	public void applyGreenColorEvenSteps()
	{
		for(int iterator=2; iterator<=50 ; iterator=iterator+2)  // 1<50 2<50 ...49<50 50<=50
		{
			//Task
			System.out.println("Apply Color to Even Steps:" + iterator);
		}
	}
	
	@Test
	public void applyGreenColorEvenSteps_if()
	{
		for(int i=1; i<=50 ; i++)  // 1<50 2<50 ...49<50 50<=50
		{
			//Task
			int rem = i % 2;
			if(rem == 0)
			{
				System.out.println("Apply Green Color to Even Steps:" + i);
			}
			else
			{
				System.out.println("Apply RED Color to Even Steps:" + i);
			}
			
		}
	}
	
	@Test
	public void applyRedColorToOddSteps_if()
	{
		for(int i=1; i<=50 ; i++)  // 1<50 2<50 ...49<50 50<=50
		{
			//Task
			int rem = i % 2;
			if(!(rem == 0))
			{
				System.out.println("Apply Color to Odd Steps:" + i);
			}
			
		}
	}
	
	//Write a program to find a student is there in the class .
	
	//Assignment :
		//Write a program to find a number in the given range
		//Write a program to find a student in the given list of students
		//Demonstrate how to use break statement in the for loop
		//Write a program to read the range and rollNumber as inputs to find in the given range/list.
		//Write a program to read the count as input and print count how many even numbers
		//Write a program to read the count as input and print count how many odd numbers
		
		//Write a program to print all even numbers in the given range
		//Write a program to print all even numbers in the given collection
		//Write a program to find the given numbers is even or odd
		//Demonstrate how to use conditional statement in the for loop
		//Write a program to Demonstrate for loop without break or condition inside for loop.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
