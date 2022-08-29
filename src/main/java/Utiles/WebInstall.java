package Utiles;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebInstall {
	WebDriver driver;
	
	@Test
	public WebDriver websetup() throws IOException {
//test

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Properties pp = new Properties();
		FileInputStream fis = new FileInputStream("D:\\TestLeafProject\\src\\test\\java\\TestData.properties");
		pp.load(fis);
		String url = pp.getProperty("url");
		
		
		driver.get(url);
		return driver;
		
	}
	
	
	
	
	
}
