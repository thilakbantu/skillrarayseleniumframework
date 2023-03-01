package testScript;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.baseClass;

public class FourthTest extends baseClass
{
@Test
	public void fourthTest()
	{

		SoftAssert soft=new SoftAssert();
		
		home.clickgears();
		home.clickSkillraryDemoApp();
		web.switchToChildBrowser();
		
		soft.assertEquals(demoApp.getPageHeader(),"SkillRary-ECommerce");
	
	web.scrollToElement(demoApp.getcontactUs());
	demoApp.clickContactUs();
	
	soft.assertTrue(contact.getPageHeader().isDisplayed());
	List<String> dataList =excel.readDataFromExcel("sheet1");
	contact.sendContactDetails(dataList.get(0),dataList.get(1),dataList.get(2),dataList.get(3));
	soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
	soft.assertAll();
		
		
	}
}
