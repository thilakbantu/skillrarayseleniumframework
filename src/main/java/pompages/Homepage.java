package pompages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	//Declaration
 @FindBy(xpath="//img[@alt=\"SkillRary\"]")
 private WebElement logo;
 @FindBy(xpath="//a[text()=' GEARS ']")
 private WebElement gearstab;
 @FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP']")
 private WebElement skillraryDemoAppLink;
 @FindBy(name="q")
 private WebElement searchTF;
 @FindBy(xpath="//input[@value=\"go\"]")
 private WebElement SearchButton;
 
 
 
//initialization
 
 public Homepage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 //utilization
 public WebElement getlogo()
 {
	 return logo;
 }
 
 public void clickgears()
 {
	 gearstab.click();
 }
 
 public void clickSkillraryDemoApp()
 {
	 skillraryDemoAppLink.click();
	 }
 public void searchFor(String data)
 {
	 SearchButton.click();
 }
	
}
