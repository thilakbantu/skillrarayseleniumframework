package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.CoreJavaForSeleniumPage;
import pompages.CoreJavaVideoPage;
import pompages.Homepage;
import pompages.SeleniumTrainingPage;
import pompages.SkillraryDemoAppPage;
import pompages.TestingPage;

public class baseClass {
	
protected	propertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
    protected WebDriver driver;
	protected Homepage home;
	protected SkillraryDemoAppPage demoApp;
	protected SeleniumTrainingPage selenium;
	protected CoreJavaForSeleniumPage corejava;
	protected CoreJavaVideoPage javavideo;
	protected TestingPage testing;
	protected ContactUsPage contact;
	// @BeforeSuite
   // @BefoerTest
	@BeforeClass
	
	public void classConfiguration()
	{
		property=new propertiesUtility();
		excel=new ExcelUtility();
		web =new WebDriverUtility();
		
		
		property.propertiesIntialization(IConsantPath.PROPERTIES_FILE_PATH);
		excel.ExcelIntialization(IConsantPath.EXCEL_FILE_PATH);
	}
	@BeforeMethod
	public void methodConfiguration()
	{
		long time= Long.parseLong(property.fetchProperty("timeouts"));
		 driver=web.openApplication(property.fetchProperty("browser"), 
				 property.fetchProperty("url"), time);
		 
		 home= new Homepage(driver);
		 Assert.assertTrue(home.getlogo().isDisplayed());
		 demoApp= new SkillraryDemoAppPage(driver);
		 selenium=new SeleniumTrainingPage(driver);
		 corejava=new CoreJavaForSeleniumPage(driver);
		 javavideo=new CoreJavaVideoPage(driver);
		 testing=new TestingPage(driver);
		 contact = new ContactUsPage(driver); 
	}
	
	@AfterMethod
	public void methodTearDown()
	{
		web.quitBrowser();
	}
	
	@AfterClass
	public void classTearDown()
	{
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite
	
}
