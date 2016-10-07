package com.unisys.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QualityStarRating {
	public static WebElement Expand_btn(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.id("expandAll"));
		 //element = driver.findElement(By.xpath("//div[5]/button"));
		 return element;
	}
	public static WebElement AdminPolicy(WebDriver driver){
		 WebElement element = null;
		 //element = driver.findElement(By.id("expandAll"));
		 element = driver.findElement(By.xpath("//*[@id='accordionSec1One']/div/div/h4"));
		 return element;
	}

}
