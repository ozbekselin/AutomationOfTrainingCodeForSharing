package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceSignUp {
	
	public static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\murat\\eclipse-workspace3\\MySelenium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	
	WebElement Account=driver.findElement(By.xpath("//*[text()= 'Create new account']"));
	Account.click();
	
	Thread.sleep(3000);
	
	WebElement first=driver.findElement(By.name("firstname"));
	first.sendKeys("Selin");
	
	WebElement last=driver.findElement(By.name("lastname"));
	last.sendKeys("Ozbek");
	
	Thread.sleep(3000);
	
	WebElement mail=driver.findElement(By.name("reg_email__"));
	mail.sendKeys("ozbekselin@endustriteknik.com");
	
	WebElement con=driver.findElement(By.name("reg_email_confirmation__"));
	con.sendKeys("ozbekselin@endustriteknik.com");

	
	WebElement pass=driver.findElement(By.name("reg_passwd__"));
	pass.sendKeys("123456");
    
	WebElement MonthOfBirth=driver.findElement(By.name("birthday_month"));
	Select ob = new Select(MonthOfBirth);
    ob.selectByValue("5");
    WebElement BirthDay=driver.findElement(By.name("birthday_day"));
    Select birth = new Select(BirthDay);
    birth.selectByVisibleText("21");
    WebElement BirthDayYear=driver.findElement(By.name("birthday_year"));
    Select birth1 = new Select(BirthDayYear);
    birth1.selectByVisibleText("1982");
    WebElement femaletoggle=driver.findElement(By.xpath("(//*[@name='sex'])[1]"));
    femaletoggle.click();
    
   
	WebElement Sign=driver.findElement(By.name("websubmit"));
	Sign.click();
    

		
	}
	

}
