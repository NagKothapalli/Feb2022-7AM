package coreConcepts;

import java.io.File;

public class FileOperations
{
	public static void main(String[] args) {
		//Downloads
		File file1 = new File("C:\\Users\\admin\\Downloads\\MyDocs\\Test.txt");
		File file2 = new File("xyz.txt");
		// Checks if file1 exists
		if (file1.exists() && !file1.isDirectory()) {
			System.out.println(file1 + " Exists");
			if(file1.delete())
			{
				System.out.println("File Deleted Successfully");
			}
		} else {
			System.out.println(file1 + " Does not exists");
		}
		// Checks if file2 exists
		if (file2.exists()) {
			System.out.println(file2 + " Exists");
		} else {
			System.out.println(file2 + " Does not exists");
		}
	}
}

