package coreConcepts;

public class ArithematicOperations
{
	public static void main(String[] args) //class leader
	{
		System.out.println("Hi , I will do some arithematic Operations Here");
		addition();
		subtraction();
		multiplication();
		division();
		int output = addition(44,88);
		System.out.println("Output my function :"+ output);
	}
	//Access Modifier , Non Access Modifier , ReturnType , name of the function (){ body }, 
	public static void addition() //Method overloading
	{
		int sum = 22+44;
		System.out.println("Sum of two Numbers :" + sum);
	}
	
	public static int addition(int a,int b)
	{
		int sum = a+b;
		//System.out.println("Sum of two Numbers :" + sum);
		return sum;
	}
	
	public static void subtraction()
	{
		int sum = 222-44;
		System.out.println("Difference of two Numbers :" + sum);
	}
	public static void multiplication()//useless
	{
		int sum = 22*44;
		System.out.println("Product of two Numbers :" + sum);
	}
	public static void multiplication(int num1,int num2)
	{
		int sum = num1 * num2;
		System.out.println("Product of two Numbers :" + sum);
	}
	public static void division()
	{
		int sum = 44/2;
		System.out.println("Division of two Numbers :" + sum);
	}
	
	
}
