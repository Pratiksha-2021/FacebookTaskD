package com.facebookAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FacebookTask2 {
WebDriver driver;

@Test
public void registerFacebook(){
	   System.setProperty("webdriver.chrome.driver", "chromedriver85.exe");
		/*System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/Drivers/chromedriver.exe");*/
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Sign up for Facebook | Facebook");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement username = driver.findElement(By.name("firstname"));
		username.sendKeys("pratiksha");
        driver.findElement(By.name("lastname")).sendKeys("Gunjal");
		driver.findElement(By.name("reg_email__")).sendKeys(Utilities.randomnogenerate());
		driver.findElement(By.name("reg_passwd__")).sendKeys("sonu123");

		WebElement element = driver.findElement(By.id("day"));
	    Utilities.enterDate(element, 7);
        WebElement dropdownmonth = driver.findElement(By.id("month"));
        Utilities.enterMonth(dropdownmonth);
		List<WebElement> allyeardropdown = driver.findElements(By.xpath("//option[contains(@value,'199')]"));
	    Utilities.enterYear(allyeardropdown, 2);
	    driver.findElement(By.name("sex")).click();

	
}}