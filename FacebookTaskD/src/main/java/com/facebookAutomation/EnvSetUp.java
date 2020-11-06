package com.facebookAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnvSetUp{
	WebDriver driver;
	
	public void initialiseWebEnv(){
		System.setProperty("webdriver.chrome.driver", "chromedriver85.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public WebDriver getDriver(){
		return driver;
		
	}
	
	

}
