package coreConcepts;

import org.junit.Test;

public class ArraysInJava 
{
	//fixed array : Array is a group of memory locations with similar datatypes - Homogenious
	
	//Signature : Modifier[opt]  DataType[]   name = { values ......};
	//Signature : Modifier[opt]  DataType   name[] = { values ......};
	
	//Declare , Assign , size , Read , write
	@Test
	public void fixedArray_int()   // Basket[Apple]
	{ //index   :         0  1  2 3 4  5 6  7
		int[]  numbers = {22,24,2,8,4,56,78,89};		
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		int value = numbers[0];   //Read the element from memory location
		System.out.println("Element at 0 index before :" + value);
		numbers[0] = 32; //Write the element in to memory location
		System.out.println("Element at 0 idex after :" + numbers[0]);
		for(int i=0;i<len;i++)
		{
			System.out.println("Elements in the array :" + numbers[i]);
		}
	}
	@Test
	public void findStudent()
	{    //                0
		
		//find 11
		for(int i=0;i<students.length;i++)
		{
			//System.out.println("Student searched :"+ students[i]); //i-0=22 , i-1 =24 , i-3=2.....
			if(students[i] == 11) //true - go to 37.....  ,  false - go to 41
			{
				System.out.println("Student came to the school");
				break;  // execution control will go out from for loop
			}			
		}		
	}
	int[]  students = {22,24,2,8,4,56,78,89,57,58,26,11,98,65,33,3422,24,2,8,4,56,78,89,57,58,26};
	public boolean findStudent(int[]  numbers, int num)
	{   
		boolean result = false;
		for(int i=0;i<numbers.length;i++)
		{			
			if(numbers[i] == num) 
			{
				result = true;
				break; 
			}			
		}	
		return result;
	}
	@Test
	public void findStudent_test()
	{
		boolean output = findStudent(students,65);
		if(output)
		{
			System.out.println("Student came to the school");
		}
		else
		{
			System.out.println("Student did not came to the school");
		}
	}
	
	//Exceptions : ArrayIndexOutOfBoundsException
	@Test
	public void fixedArray_string()
	{   //                  0      1     2      3        4
		String[]  names = {"Ram","Ravi","Raj","Ramesh"};
		int len = names.length;
		System.out.println("Length of the array :" + len);
		String value = names[0];   //Read the element from memory location
		System.out.println("Element at 0 index before :" + value);
		names[0] = "32"; //Write the element in to memory location
		System.out.println("Element at 0 idex after :" + names[0]);
		//names[4] = "Rajesh";
		for(int i=0;i<len;i++)
		{
			System.out.println("Elements in the array :" + names[i]);
		}
		
	}
	@Test
	public void dynamicArray_int()   // Basket[Apple]
	{ //index   :         0  1  2 3 4  5 6  7
		//int[]  numbers = {22,24,2,8,4,56,78,89};	
		int[]  numbers = new int[10]; //default values : 0
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		int value = numbers[0];   //Read the element from memory location
		System.out.println("Element at 0 index before :" + value);
		numbers[0] = 32; //Write the element in to memory location
		System.out.println("Element at 0 idex after :" + numbers[0]);
		for(int i=0;i<len;i++)
		{
			System.out.println("Elements in the array :" + numbers[i]);
		}
		
		for(int i=0;i<len;i++)
		{
			numbers[i]=22+i;
			System.out.println("Elements in the array :" + numbers[i]);
		}
	}
	@Test
	public void dynamicArray_string()
	{   //                  0      1     2      3        4
		//String[]  names = {"Ram","Ravi","Raj","Ramesh"};
		String[]  names = new String[10]; //default value : null
		int len = names.length;
		System.out.println("Length of the array :" + len);
		String value = names[0];   //Read the element from memory location
		System.out.println("Element at 0 index before :" + value);
		names[0] = "32"; //Write the element in to memory location
		System.out.println("Element at 0 idex after :" + names[0]);
		//names[4] = "Rajesh";
		for(int i=0;i<len;i++)
		{
			System.out.println("Elements in the array :" + names[i]);
		}
		
		for(int i=0;i<len;i++)
		{
			names[i] = "Selenium-"+i;
			System.out.println("Elements in the array :" + names[i]);
		}
		
	}
	
	//Assignment : 
	
	//Assignment :
		//Write the above fixed array program with different data types like String , char 
			//Write a program to read the array as input and find each element is even or not .
			//Move all even numbers in to one array
			//Move all odd numbers in to one array
			//Write a program to read the student numbers as an array and find a particular number . Read the number to find as input
			//Write a program to demonstrate index out of bounds exception with a fixed array
		
		//Write the above dynamic array program with different data types like String , char 
		//Write a program to read the marks of the student in a fixed array and calculate percentage of marks for each student then move the percentage in to a dynamic array.
		//Write a program to show the default values of all data types in java
		//Write a program to demonstrate index out of bounds exception with a dynamic array
	
	
	
	
	
	
	
	
	
	
	
	
	

}
