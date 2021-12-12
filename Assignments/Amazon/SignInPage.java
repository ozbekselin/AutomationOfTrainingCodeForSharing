package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	public WebDriver driver;
	
	@FindBy(name="email")WebElement Email;
	@FindBy(id="continue")WebElement Continue;
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void EmailFieldSendKeys() {
		Email.sendKeys("moccocokko@hotmail.com");
	}
	
	public void ContinueButtonClick() {
	Continue.click();
}

}
