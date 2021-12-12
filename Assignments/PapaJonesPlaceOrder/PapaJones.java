package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class PapaJones {
	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub

		
			
System.setProperty("webdriver.chrome.driver", "C:\\Users\\murat\\eclipse-workspace3\\MySelenium\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
				driver.get("http://www.papajohns.com/");
				driver.manage().window().maximize();
				
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			WebElement Order=driver.findElement(By.xpath("//*[text()= 'Start Your Order']"));
			Order.click();
			
			
			WebElement Country1=driver.findElement(By.name("country"));
			Select ob1=new Select(Country1);
			ob1.selectByVisibleText("USA");
			
			WebElement Address1=driver.findElement(By.id("locations-addresstype"));
			Select ob2=new Select(Address1);
			ob2.selectByVisibleText("Residence");
			
			
			WebElement Street=driver.findElement(By.name("input-autocomplete"));
			Street.sendKeys("9915 Longford Ct.Vienna, VA, USA");
			Thread.sleep(2000);
			
		
	     	WebElement Apt=driver.findElement(By.name("aptstefloor"));
			Select ob5=new Select(Apt);
			ob5.selectByVisibleText("None");
			
			WebElement Zip=driver.findElement(By.name("zipcode"));
			Zip.sendKeys("22181");
			
			
		  	WebElement Submit=driver.findElement(By.xpath("//input[@value='Submit']"));
			Submit.click();
			
			Thread.sleep(1000);
			
			WebElement Create=driver.findElement(By.xpath("//*[text()=' ORIGINAL CRUST ']")); 
			Create.click();
			
			Thread.sleep(1000);
			
			WebElement Create1=driver.findElement(By.xpath("//*[text()='Cheese']")); 
			Create1.click();
			
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,150)", "");
			
			Thread.sleep(1000);
			
			WebElement Create2=driver.findElement(By.xpath("//*[text()='Light Cheese']")); 
			Create2.click();
			
			Thread.sleep(1000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,250)", "");
			
			Thread.sleep(1000);
			
			WebElement Create3=driver.findElement(By.xpath("//*[text()=' Parmesan Romano ']")); 
			Create3.click();
			
			Thread.sleep(1000);
			
			WebElement Add=driver.findElement(By.id("addProductToCart"));
			Add.click();
			
			WebElement Check=driver.findElement(By.xpath("//*[text()='Checkout']"));
			Check.click();
			
			Thread.sleep(1000);
			
			WebElement own3=driver.findElement(By.id("contact-firstname"));
			own3.sendKeys("Selin");
			
			Thread.sleep(1000);
			
			WebElement ln=driver.findElement(By.id("contact-lastname"));
			ln.sendKeys("Ozbek");
			
			Thread.sleep(1000);
			
			WebElement em=driver.findElement(By.id("contact-email"));
			em.sendKeys("ozbekselin@endustriteknik.com");
			
			Thread.sleep(1000);
			
			WebElement ph=driver.findElement(By.id("phone-number"));
			ph.sendKeys("5714517438");
			
			Thread.sleep(1000);
			
			WebElement eo=driver.findElement(By.id("create-account-emailoffers"));
			eo.click();
			
			Thread.sleep(1000);
			
			WebElement cc=driver.findElement(By.id("credit-card-number"));
			cc.sendKeys("122333445742");
			
			Thread.sleep(1000);
			
			WebElement ccn=driver.findElement(By.id("credit-card-name"));
			ccn.sendKeys("Selin Ozbek");
			
			Thread.sleep(1000);
			
			WebElement exm=driver.findElement(By.id("credit-card-expiration-month"));
			exm.sendKeys("11");
			
			Thread.sleep(1000);
			
			WebElement exy=driver.findElement(By.id("credit-card-expiration-year"));
			exy.sendKeys("2025");
			
			Thread.sleep(1000);
			
			WebElement zc=driver.findElement(By.id("billing-zipcode"));
			zc.sendKeys("22191");
			
			Thread.sleep(1000);
			
			WebElement se=driver.findElement(By.id("credit-card-cvv"));
			se.sendKeys("121");
			
			Thread.sleep(1000);
			
			WebElement inp=driver.findElement(By.id("input"));
			inp.click();
			Thread.sleep(1000);
			
			WebElement vo=driver.findElement(By.id("validate-order"));
			vo.click();
			
			
			
						
			
	}
	

}

