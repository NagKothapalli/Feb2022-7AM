package coreConcepts;

// Signature of class
	//Modifier   class   Name{  Members : Variables / methods  }
	//Access Modifiers : private , default , protected , public
    //NonAccess Modifiers : static , final

	//ClassName : Must start with Uppercase , no spaces within the class name
	// no special characters in classname 
	// class name must be same as file name
	

public class BasicConcepts
{
	//Variable : Signature :
		//Modifier[opt]   DataType  Name; - Declaration    || Modifier   DataType  Name  = value; - Assignment
	    public static    String   collegeName = "JNTU@HYD";
		public           String   stdName = "Ram";
		protected        int      stdNum =0; //Type mismatch error
		                 double   stdMarks = 20.44; // default
		                 char     stdGrade = 'C';
		                 boolean  stdResult = true; //case sensitive
		                 boolean  StdResult = false;
	    public static final double intrestRate = 2.5;
	    
  //Naming conventions for member of class : variable / function
	    //It can start with _ , $ , a-z , A-Z - only applicable to constructor ,
	    //It can not have any other special characters any where in the name
	    //No spaces in the name
	    //It has to follow  camelCasing
	int _stdNum;  int std_Num;  int stdNum_;
	int $stdNum;  int std$Num;  int stdNum$;
	int stdNumber;  int empNum;  int abc; int def;
	int StdNum;  int EmpID;  int Abc;  int Xyz;
	int studentNumber;  int stdNum1;  int std1Num;
	
	//int 1stdNum;
	//int stdNum;  
	
		                 
  //Function/Method   : Signature
	    //Modifier[opt]   ReturnType    Name(){  Body - Definition  }
	    			//No -> void : Yes -> DataType 
	    
	    //Modifier[opt]   ReturnType    Name(arguments-input[opt]){  Body - Definition  } 
	    								//DataType arg1,DataType arg2,....
	  int number;
	  double xyz;
   //Main method - class leader
   //p s v m  - 
	   public static void main(String[] args)
	   {
		   System.out.println("Welcome to Selenium Java"); //type syso then click CTRL + SPACE keys
		   //addition();
		   //addition(55,88);
		   //addition(22,44,66);
		   int output = addition(1,2,3,4);
		   System.out.println("My output is :" + output);
	   }
	   // 0 , 0 [No , No]
	   public static void addition() //normal student in a class room
	   {
		   //Body
		   int sum = 22+44;
		   //System.out.println("Sum of Two Numbers : sum");
		   System.out.println("Sum of Two Numbers : " + sum);
	   }
	   // 0 , 1 [ No , Yes ]
	   public static void addition(int a,int b)
	   {
		   int sum = a + b ;
		   System.out.println("Sum of two Numbers :" + sum);
	   }
	   public static void addition(int a,String b)
	   {
		   String sum = a + b ; //int+int=int , int+string / string+int / string+string : string
		   System.out.println("Sum of two Numbers :" + sum);
	   }
	   public static void addition(int a,int b,int c) //Method Overloading - Polymorphism - Oops
	   {
		   int sum = a + b + c ;
		   System.out.println("Sum of three Numbers :" + sum);
	   }
	   // 1 , 1 [Yes , Yes ]
	   public static int addition(int a,int b,int c,int d) //Method Overloading - Polymorphism - Oops
	   {
		   int sum = a + b + c + d;
		   //System.out.println("Sum of three Numbers :" + sum);
		   return sum;
	   }
	   

}

//In a java file we can have multiple classes , but only one public class

class Yahoo    //Yahoo.jva
{
	
}

class Amazon
{
	
}

class Student
{
	
}

class Employee
{
	
}



