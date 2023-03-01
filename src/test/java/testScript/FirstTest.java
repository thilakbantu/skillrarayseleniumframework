package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.baseClass;

public class FirstTest extends baseClass {
@Test
public void firstTest()
{
	SoftAssert soft =new SoftAssert();
	home.clickgears();
	home.clickSkillraryDemoApp();
	web.switchToChildBrowser();
	soft.assertEquals(demoApp.getPageHeader(),"SkillRary-ECommerce");
   demoApp.mouseHoverToCourse(web);
   demoApp.clickSeleniumtraining();
   soft.assertEquals(demoApp.getPageHeader(),"Selenium Training" );
   //soft.assertEquals(demoApp.getPageHeader(),"Selenium Training");
   selenium.doubleclickPlusButton(web);
   selenium.clickAddToCart();
   web.handleAlert();
   
   soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
   soft.assertAll();
}
}
