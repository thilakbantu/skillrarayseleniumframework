package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageheader;

	@FindBy(xpath="//img[@id='java']")
	private WebElement javaImage;
	
	
	@FindBy(xpath="//div[@id='cartArea']")
	private WebElement MyCartArea;

	@FindBy(xpath="//footer/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	

		//Initialization
		public TestingPage(WebDriver driver) {
			PageFactory.initElements( driver,this);
			
		}
		//Utilization
		public String getPageHeader() {
			return pageheader.getText();
		}
		
		public WebElement getJavaImage() {
			return javaImage;
		}
		public WebElement getMyCartArea() {
			return MyCartArea;
			
		}
		public WebElement getfacebookIcon()
		{
		return facebookIcon;	
		}
		public void clickFacebookIcon() {
			facebookIcon.click();
		}
		

	}
	
	

