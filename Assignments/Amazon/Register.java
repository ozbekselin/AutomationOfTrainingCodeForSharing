package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	public WebDriver driver;
	
	@FindBy(name="customerName")WebElement Name;
	@FindBy(name="email")WebElement Mail;
	@FindBy(name="password")WebElement Password;
	@FindBy(name="passwordCheck")WebElement PassCheck;
	@FindBy(id="continue")WebElement Continue;
	

    public Register(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
    }
	    public void NameFieldSendKeys() {
		Name.sendKeys("Selin");
	    }
	    
	    public void MailFieldSendKeys() {
		Mail.sendKeys("moccocokko@hotmail.com");
	    }
	    
	   	public void PasswordFieldSendKeys() {
		Password.sendKeys("123456");
	   	}
					
		public void PassCheckFieldSendKeys() {
	    PassCheck.sendKeys("123456");
	    
	   	
		}	
		
		public void ContinueButtonClick() {
		 Continue.click();
		    
		}
			
		}
    