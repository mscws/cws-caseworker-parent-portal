package com.unisys.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookAppointment {
	public static WebElement FirstName(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//form/div[1]/div[1]/input"));
		 return element;
	}
	public static WebElement LastName(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//form/div[1]/div[2]/input"));
		 return element;
	}
	public static WebElement Address(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//form/div[2]/div[1]/input"));
		 return element;
	}
	public static WebElement AddressOption1(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//form/div[2]/div[2]/select"));
		 return element;
	}
	public static WebElement AddressOption2(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//form/div[2]/div[3]/select"));
		 return element;
	}
	public static WebElement AddressOption3(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//form/div[2]/div[4]/select"));
		 return element;
	}
	public static WebElement ZIPCODE(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//form/div[2]/div[5]/select"));
		 return element;
	}
	public static WebElement EmailID(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//form/div[3]/div[1]/input"));
		 return element;
	}
	public static WebElement TelephoneNumber(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//form/div[3]/div[2]/input"));
		 return element;
	}
	public static WebElement Date(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("datetimepicker1"));
		 //element = driver.findElement(By.xpath("//form/div[2]/div[5]/select"));
		 return element;
	}
	public static WebElement NoOfChildren(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//form/div[4]/div[2]/select"));
		 return element;
	}
	public static WebElement RequestAppointment_Btn(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//form/div[5]/button[3]"));
		 return element;
	}
	public static WebElement BookingConfirmationStatusmsg(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//*[@id='modal-transparent4']/div/div/div[2]/div/h4/b"));
		 return element;
	}
	public static WebElement BookingConfirmationOk_btn(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath(".//*[@id='modal-transparent4']/div/div/div[2]/b/b/button"));
		 return element;
	}
}
