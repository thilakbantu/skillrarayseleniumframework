package testScript;

import org.testng.asserts.SoftAssert;

import genericLibraries.baseClass;
import pompages.Homepage;

public class ThridTest extends baseClass {

	
	public void thridTest()
	{
		SoftAssert soft=new SoftAssert();
		home.searchFor("core java for selenium");
		soft.assertEquals(corejava.getPageHeader(), "CORE JAVA FOR SELENIUM");
		
		core
		soft.assertEquals(javavideo.getPageHeader(), "core Java For Selenium Traing");
		
		
		
	}
}
