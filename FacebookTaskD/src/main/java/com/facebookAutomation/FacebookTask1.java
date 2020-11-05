package com.facebookAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookTask1 {
	WebDriver driver;

	public void enterdredential(String mobileno) {
		System.setProperty("webdriver.chrome.driver", "chromedriver85.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("open browser");
		WebElement username = driver.findElement(By.name("firstname"));
		username.sendKeys("pratiksha");
		String nameValue = username.getAttribute("name");
		System.out.println("Attribute of name is>>" + nameValue);
		driver.findElement(By.name("lastname")).sendKeys("Gunjal");
		// driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gunjal");
		driver.findElement(By.name("reg_email__")).sendKeys(mobileno);
		
		//driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pratiksha@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("sonu1234");
		
		WebElement element = driver.findElement(By.id("day"));
		Select sel = new Select(element);
		// sel.selectByIndex(7);
       // sel.selectByValue("10");
		sel.selectByVisibleText("7");

		System.out.println("day is enter");
		String[] arr = { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		WebElement dropdownmonth = driver.findElement(By.id("month"));
		Select sel2 = new Select(dropdownmonth);
		List<WebElement> alloption = sel2.getOptions();
		int size = alloption.size();
		System.out.println("total size is" + size);

		for (WebElement we : alloption) {
			for (int j = 1; j < arr.length; j++) {
				// String alldata = alloption.get(i).getText();
				// System.out.println("All dropdown text is" + alldata);
				if (we.getText().equals(arr[j])) {
					// System.out.println("Matched");
					alloption.get(2).click();

				}

			}

		}
		System.out.println("month title match");
	
		List<WebElement> allyeardata = driver.findElements(By.xpath("//option[contains(@value,'199')]"));
		int allyearsize = allyeardata.size();
		System.out.println("size of year>>>" + allyearsize);
		for (int i = 1; i < allyearsize; i++) {
			String allyeardatavalue = allyeardata.get(i).getText();
			System.out.println("All dropdown text is" + allyeardatavalue);
			allyeardata.get(2).click();
		}
		System.out.println("valid year enter");
		
		WebElement radiobtn = driver.findElement(By.name("sex"));
		radiobtn.click();
		/*driver.findElement(By.name("websubmit")).click();
		System.out.println("radio btn select");*/
	}
	
}

