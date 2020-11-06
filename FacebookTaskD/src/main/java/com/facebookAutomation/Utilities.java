package com.facebookAutomation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
	
	public static void selectDropDown(WebElement ele,String strDropDownOption){
		Select sel = new Select(ele);
		sel.selectByVisibleText(strDropDownOption);
	}
	
	public static void selectDropDownOfMonth(WebElement ele,int index){
		String[] arr = { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        Select select = new Select(ele);
		List<WebElement> alloption = select.getOptions();
	    for (WebElement we : alloption) {
			for (int j = 1; j <arr.length; j++) {
			if (we.getText().equals(arr[j])) {
					String alldropdown=we.getText();
					// System.out.println("Matched");
					alloption.get(index).click();

				}

			}

		}
	}
		
		
		public static void selectDropDownOfYear(List<WebElement> yeardropdown,int no){
			int yearsize = yeardropdown.size();
			System.out.println("size of year>>>"+yearsize);
			for(int i = 1;i<yearsize;i++)
			{
				String dropDownOption= yeardropdown.get(i).getText();
				System.out.println("All dropdown text is" + dropDownOption);
				yeardropdown.get(no).click();
				
				
			}
			}
		
		
		public static List<String> getAllMonthInCalender(){
			List<String>specifiedList=Arrays.asList("Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" );
			return specifiedList;
			
		    }
		
		
		
		
		
		public static String getRandomMonthInCalender(){
			Random random=new Random();
			String randomMonth="";
			List<String>givenlist=Arrays.asList("Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
			
			int numberofElement=12;
			for(int i=0;i<numberofElement;i++){
				int randomIndex=random.nextInt(givenlist.size());
				randomMonth=givenlist.get(randomIndex);
			   }
			
			return randomMonth;
			
		}
	}
	

