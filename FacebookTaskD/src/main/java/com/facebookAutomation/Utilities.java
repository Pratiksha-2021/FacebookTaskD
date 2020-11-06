package com.facebookAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilities {

	
	
	public static String randomnogenerate(){
		
		double randomDouble = Math.random();
		randomDouble = randomDouble * 999999999 + 10000;
		int randomInt = (int) randomDouble;
		System.out.println(randomInt);// 2147483647
		String str1 = Integer.toString(randomInt);
		String actual="str1";
		return str1;
		
		
	}
	
	public static void enterDate(WebElement ele,int index){
		Select sel = new Select(ele);
		 sel.selectByIndex(index);
		 
		 sel.selectByIndex(index);

		/*sel.selectByValue("10");
		sel.selectByVisibleText("5");*/
	}
	public static void enterMonth(WebElement ele){
		String[] arr = { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        Select sel2 = new Select(ele);
		List<WebElement> alloption = sel2.getOptions();
	    for (WebElement we : alloption) {
			for (int j = 1; j < arr.length; j++) {
			if (we.getText().equals(arr[j])) {
					String alldropdown=we.getText();
					// System.out.println("Matched");
					alloption.get(2).click();

				}

			}

		}
	}
		
		
		public static int enterYear(List<WebElement> allyeardata,int no){
			
			
			
			int allyearsize = allyeardata.size();
			System.out.println("size of year>>>"+allyearsize);
			for(int i = 1;i<allyearsize;i++)
			{
				String allyeardatavalue = allyeardata.get(i).getText();
				System.out.println("All dropdown text is" + allyeardatavalue);
				allyeardata.get(no).click();
				
				
			}
			return allyearsize;
			
			
			
			
		}
	}
	

