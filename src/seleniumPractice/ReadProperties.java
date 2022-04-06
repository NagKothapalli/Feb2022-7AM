package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties
{
	String filepath;
	public ReadProperties(String myfilepath)
	{
		filepath = myfilepath;
	}
	public String getData(String mykey) throws IOException
	{
		FileInputStream myfile = new FileInputStream(filepath); // Like a news paper  "TestData/Apsrtc.properties"
		Properties prop = new Properties(); //Like a news reader
		prop.load(myfile);
		String myvalue = prop.getProperty(mykey);
		return myvalue;
	}

}
