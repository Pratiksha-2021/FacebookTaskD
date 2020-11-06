package com.facebookAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookSignupAssignment extends EnvSetUp{
	private ModularFunctions objModularFunctions;
	private By drpLocator=By.id("month");
	@BeforeClass
	public void initialiseWebEnvironment(){
		objModularFunctions=new ModularFunctions(this);
		initialiseWebEnv();
		
		
	}
	
	@Test
	public void registerFacebook(){
		objModularFunctions.verifyFacebookTitle();
		objModularFunctions.setFirstName("pratiksha");
		objModularFunctions.setLastName("Gunjal");
		objModularFunctions.setMobileNumber(Utilities.randomnogenerate());
		objModularFunctions.setPassword("Admin123");
		objModularFunctions.setDateOfBirthDropDown("4");
		//objModularFunctions.setDateOfMonthDropDown(5);
		//objModularFunctions.setYearOfDropDown(7);
		//objModularFunctions.verifyAllDropDownValues(drpLocator);
		objModularFunctions.setMonthInDropdown(Utilities.getRandomMonthInCalender());
		objModularFunctions.selectRadiobtn();
		
	}
	


	
	

}

