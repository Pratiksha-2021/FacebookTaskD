package com.facebookAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ModularFunctions {
	private EnvSetUp objEnvSetup; // if we extend then again browser open avoid
									// this use constructor

	public ModularFunctions(EnvSetUp envSetup) {
		this.objEnvSetup = envSetup;
	}

	public void verifyFacebookTitle() {
		String strTitle = objEnvSetup.getDriver().getTitle();
		System.out.println("FB Title----->" + strTitle);
		Assert.assertEquals(strTitle, "Sign up for Facebook | Facebook");
		objEnvSetup.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void setFirstName(String strFirstName) {
		WebElement username = objEnvSetup.getDriver().findElement(By.name("firstname"));
		username.sendKeys(strFirstName);
	}

	public void setLastName(String strLastName) {
		WebElement webelement = objEnvSetup.getDriver().findElement(By.name("lastname"));
		webelement.sendKeys(strLastName);
	}

	public void setMobileNumber(String strMobileNumber) {
		WebElement webelement = objEnvSetup.getDriver().findElement(By.name("reg_email__"));
		webelement.sendKeys("9" + strMobileNumber);
	}

	public void setPassword(String strpassword) {
		WebElement element = objEnvSetup.getDriver().findElement(By.name("reg_passwd__"));
		element.sendKeys(strpassword);
	}

	public void setDateOfBirthDropDown(String drpOptions) {
		WebElement element = objEnvSetup.getDriver().findElement(By.id("day"));
		Utilities.selectDropDown(element, drpOptions);
	}

	public void setDateOfMonthDropDown(int index) {
		WebElement dropdownmonth = objEnvSetup.getDriver().findElement(By.id("month"));
		Utilities.selectDropDownOfMonth(dropdownmonth, index);
	}

	public void setYearOfDropDown(int index) {
		List<WebElement> yeardropdown = objEnvSetup.getDriver()
				.findElements(By.xpath("//option[contains(@value,'199')]"));
		Utilities.selectDropDownOfYear(yeardropdown, index);
	}

	public void selectRadiobtn() {
    objEnvSetup.getDriver().findElement(By.name("sex")).click();
    }
	
	public void verifyAllDropDownValues(By locator){
		
		WebElement webElement=objEnvSetup.getDriver().findElement(locator);
		Select select=new Select(webElement);
		List<WebElement>alloption=select.getOptions();
		List<String>expectedMonthResult=Utilities.getAllMonthInCalender();
		for(WebElement weElement:alloption){
			
			boolean blnFlag=false;
			
			
			for(int i=0;i<expectedMonthResult.size();i++){
				if(weElement.getText().equals(expectedMonthResult.get(i))){
					
					blnFlag=true;
					
				}
			}
			Assert.assertTrue(blnFlag);
		}
		
	  }
	
	public void setMonthInDropdown(String drpOptions){
		WebElement element=objEnvSetup.getDriver().findElement(By.id("month"));
		Utilities.selectDropDown(element,drpOptions );
		
	}
	
	
}
