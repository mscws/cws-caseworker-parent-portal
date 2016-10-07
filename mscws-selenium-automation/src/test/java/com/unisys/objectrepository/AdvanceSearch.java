package com.unisys.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvanceSearch {
	public static WebElement HandicapAccessibility(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//*[@id='modal-transparent4']/div/div/div[2]/b/b/button"));
		 return element;
	}
	public static WebElement TimeOfServiceProvided(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//*[.//*[@id='advanceSearchGroup']/div/div/div[1]/div[2]/label/b"));
		 return element;
	}
	public static WebElement AgeGroup(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//*[@id='advanceSearchGroup']/div/div/div[2]/div/div/div/div[1]/div[2]"));
		 return element;
	}
	public static WebElement EmotionallyDisturbed(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//*[@id='advanceSearchGroup']/div/div/div[3]/div/div/div/div/div[1]/div/div/label/div/h5"));
		 return element;
	}
	public static WebElement MentallyImpaired(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("County1"));
		 element = driver.findElement(By.xpath("//*[@id='advanceSearchGroup']/div/div/div[3]/div/div/div/div/div[7]/div/div/label/div/h5"));
		 return element;
	}

}
