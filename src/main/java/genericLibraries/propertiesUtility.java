package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * 
 * this class contains reusable method to perform actions on properties file
 * 
 */

public class propertiesUtility {
	private Properties property;
public void propertiesIntialization(String filePath)
{
	
	FileInputStream fis=null;
	
	try
	{
		fis=new FileInputStream(filePath);
	}
	catch(FileNotFoundException e)
	{e.printStackTrace();
		
	}
	 property =new Properties();
	try
	{
		property.load(fis);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
public String fetchProperty(String key)
{
	return property.getProperty(key);
}

}