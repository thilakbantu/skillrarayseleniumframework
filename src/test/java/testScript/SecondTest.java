package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.baseClass;

public class SecondTest extends baseClass {
@Test
public void secondTest()
{
	SoftAssert soft=new SoftAssert();
	
	home.clickgears();
	home.clickSkillraryDemoApp();
	web.switchToChildBrowser();
	
	soft.assertEquals(demoApp.getPageHeader(),"SkillRary-ECommerce");
	demoApp.selectCategory(web, 1);
	soft.assertEquals(testing.getPageHeader(),"Testing");
	web.dragAndDropElement(testing.getJavaImage(),testing.getMyCartArea());
	web.scrollToElement(testing.getfacebookIcon());
	testing.clickFacebookIcon();
	soft.assertAll();
}
	
	
	
}
