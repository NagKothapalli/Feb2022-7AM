package coreConcepts;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MyCollections
{
	//ArrayList is a class   , List is an interface , ArrayList implements List
	//ArrayList<GenericType>  mylist = new ArrayList<GenericType>();
	//declaration , assignment/add , delete , length , read , write , 
	@Test
	public void workWithArrayList()
	{
		//ArrayList<Integer> mylist = new ArrayList<Integer>();
		List<Integer> mylist = new ArrayList<Integer>();
		int len = mylist.size();
		System.out.println("Length before :"+ len);
		mylist.add(22);
		mylist.add(44);
		mylist.add(252);
		mylist.add(484);
		System.out.println("Length2 :"+ mylist.size());
		System.out.println("first element :"+mylist.get(0));
		System.out.println("*****111******");
		for(int i=0;i<mylist.size();i++)
		{			
			System.out.println("all elements :"+mylist.get(i));
		}
		mylist.remove(1);
		
		System.out.println("*****222******");
		System.out.println("Length after delete :"+ mylist.size());
		for(int i=0;i<mylist.size();i++)
		{			
			System.out.println("all elements after delete :"+mylist.get(i));
		}
	}

}
