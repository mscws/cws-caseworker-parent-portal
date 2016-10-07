package com.unisys.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProviderDetails {
	public static WebElement ProviderName(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//*[@id='moreDetailsNameId2']/h2/b"));
		 return element;
	}
	public static WebElement BookAppointment_Btn(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//div[1]/div[4]/button"));
		 return element;
	}
	public static WebElement Back_btn(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//div[5]/button"));
		 return element;
	}

}
