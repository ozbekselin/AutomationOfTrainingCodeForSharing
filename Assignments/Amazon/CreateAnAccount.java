package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccount {
	
	public WebDriver driver;
	
	@FindBy(id="createAccountSubmit")WebElement Create;
	
	public CreateAnAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

    public void CreateButtonClick(){
    Create.click();
		
	}
    
}
	
	
	

