package com.unisys.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailOverlay {
	public static WebElement from(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//*[@id='modal-transparent1']/div/div/div[2]/form/div[1]/div/input"));
		 return element;
	}
	public static WebElement to(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//*[@id='modal-transparent1']/div/div/div[2]/form/div[2]/div/input"));
		 return element;
	}
	public static WebElement subject(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//*[@id='modal-transparent1']/div/div/div[2]/form/div[3]/div/input"));
		 return element;
	}
	public static WebElement message(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//*[@id='modal-transparent1']/div/div/div[2]/form/div[4]/div/textarea"));
		 return element;
	}
	public static WebElement sendBtn(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//*[@id='modal-transparent1']/div/div/div[2]/form/button[2]"));		
		 return element;
	}
	public static WebElement emailStatus(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//*[@id='modal-transparent2']/div/div/div[2]/div/h4/b"));
		 return element;
	}
	public static WebElement emailStatus_OkBtn(WebDriver driver){
		 WebElement element = null;
		 element = driver.findElement(By.xpath("//*[@id='modal-transparent2']/div/div/div[2]/button"));
		 return element;
	}	
	
}
