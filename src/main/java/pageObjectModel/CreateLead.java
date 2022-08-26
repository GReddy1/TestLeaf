package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateLead {

	WebDriver driver;
	
	private By companyName = By.id("createLeadForm_companyName");
	
	
	private By firstName = By.id("createLeadForm_firstName");
	
	
	public CreateLead(WebDriver driver) {
		this.driver= driver;
	}
	
	
	public WebElement getCompany() {
return driver.findElement(companyName);
	}
	
	

	
	public WebElement getFirst() {
return driver.findElement(firstName);
	}
	
	
	
}
