package testApplication;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utiles.WebInstall;
import pageObjectModel.CreateLead;
import pageObjectModel.LoginPage;

public class TestData {

	public WebDriver driver;
	
	
	@Test
	public void testRun() throws IOException {

		Properties pp = new Properties();
		FileInputStream fis = new FileInputStream("D:\\TestLeafProject\\src\\test\\java\\TestData.properties");
		
		pp.load(fis);
		String user = pp.getProperty("username");
		String pass = pp.getProperty("password");
		String compName = pp.getProperty("companyName");
		
		WebInstall wb = new WebInstall();
			driver=	wb.websetup();
			
			LoginPage lp = new LoginPage(driver);
				
				lp.getusername().sendKeys(user);
				lp.getpassword().sendKeys(pass);
				lp.clicklogin().click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
				
				
		CreateLead cl = new CreateLead(driver);
		cl.getCompany().sendKeys(compName);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
