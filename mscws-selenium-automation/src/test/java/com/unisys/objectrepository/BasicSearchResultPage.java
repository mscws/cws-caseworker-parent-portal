package com.unisys.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicSearchResultPage {
	
	public static WebElement Country(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("County1"));
		 return element;
	}
	public static WebElement City(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("city1"));
		 return element;
	}
	public static WebElement QualityRating(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("quality1"));
		 return element;
	}	
	public static WebElement ProviderType(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("providerType1"));
		 return element;
	}
	
	public static WebElement ProviderName(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("providerNameId1"));
		 return element;
	}
	public static WebElement ResetBtn(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//*[@id='resetBtn1']"));
		 return element;
	}
	public static WebElement SearchBtn(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//*[@id='searchBtn1']"));
		 return element;
	}
	public static WebElement MapView1(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//div[3]/div[3]/div[1]/a/span"));
		 return element;
	}
	public static WebElement MailBox1(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//div[3]/div[3]/div[2]/a/span"));
		 return element;
	}
	public static WebElement MoreDetails_Btn(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("(//*[@id='btnMoreDetails'])[1]"));
		 return element;
	}
	public static WebElement BookAppointment_Btn(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("(//*[@id='btnBookApp'])[1]"));		 
		 return element;
	}
	public static WebElement AdvanceSearch(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("advSearch1"));
		 return element;
	}
	public static WebElement RatingsDetails_lnk(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("advSearch1"));
		 element = driver.findElement(By.xpath("//*[@id='accordionPanel1OneHelp']/div/b/div[1]/a"));
		 return element;
	}	
	
	

}
