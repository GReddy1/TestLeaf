package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	private By username =By.id("username");
	private By password =By.id("password");
	private By clickLogin =By.xpath("//input[@type='submit']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement getusername() {
return driver.findElement(username);
		
	}
	
	public WebElement getpassword() {
return driver.findElement(password);
	}
	
			
	
	public WebElement clicklogin() {
return driver.findElement(clickLogin);
	}
	
	
	
	
	
	
	
}
