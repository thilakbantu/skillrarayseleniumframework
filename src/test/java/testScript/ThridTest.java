package testScript;

import org.testng.asserts.SoftAssert;

import genericLibraries.baseClass;
import pompages.Homepage;

public class ThridTest extends baseClass {

	
	public void thridTest() throws InterruptedException
	{
		SoftAssert soft=new SoftAssert();
		 
		  home.searchFor("core java for selenium");
		  soft.assertEquals(corejava.getPageHeader(),"CORE JAVA FOR SELENIUM");
		  
		  corejava.clickCoreJavaForSeleniumLink();
		  soft.assertEquals (javavideo.getPageHeader(),"Core Java For Selenium Training");
		  
		  
		  javavideo.clickCloseCookies();
		  web.switchToFrame();
		  
		  javavideo.clickplayButton();
		  Thread.sleep(2000);
		  javavideo.clickpauseButton();
		  
		  web.switchBackFromFrame();
		  
		  javavideo.clickAddToWishlist();
		  
		  soft.assertAll();
	  }
	
		
		
	}

