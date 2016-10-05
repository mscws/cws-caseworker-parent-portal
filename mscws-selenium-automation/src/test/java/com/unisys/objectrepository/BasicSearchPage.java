package com.unisys.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicSearchPage {

  public static WebElement Country(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("County"));
		 return element;
	}
	public static WebElement City(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("city"));
		 return element;
	}
	public static WebElement QualityRating(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("quality"));
		 return element;
	}	
	public static WebElement ProviderType(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("providerType"));
		 return element;
	}
	
	public static WebElement ProviderName(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("search"));
		 return element;
	}
	public static WebElement ResetBtn(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//*[@id='resetBtn']"));
		 return element;
	}
	public static WebElement SearchBtn(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("searchBtn"));
		 return element;
	
	
  }
}
