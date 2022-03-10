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

}
