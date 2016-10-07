package com.unisys.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScriptInitiatorTest {
  public WebDriver driver = null;
	
  @Test(enabled=true)
  public void BasicSearchTC1() {
	  WebDriver driver = null;
		try {
			driver = CommonClass.launchApplication(driver);
			//driver = CommonClass.NavigateToBasicSearch(driver);
			//driver = CommonClass.SearchWithProviderName(driver,"Ahead of the Crowd Academy");
			driver = CommonClass.SearchWithProviderDetails(driver);
			Thread.sleep(3000);
			driver.quit();
		} catch (InterruptedException e) {			
			e.printStackTrace();
			driver.quit();
		}
  }
  
  @Test(enabled=true)
  public void BasicSearchTC2() {
	  WebDriver driver = null;
		try {
			driver = CommonClass.launchApplication(driver);
			//driver = CommonClass.NavigateToBasicSearch(driver);
			driver = CommonClass.SearchWithProviderName(driver,"Ahead of the Crowd Academy");
			//driver = CommonClass.SearchWithProviderDetails(driver);
			Thread.sleep(3000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
		}
  }
 
  @Test(enabled=true)
  public void ValidateMailTC1(){
	  WebDriver driver = null;
		try {
			driver = CommonClass.launchApplication(driver);
			//driver = CommonClass.NavigateToBasicSearch(driver);
			driver = CommonClass.SearchWithProviderName(driver,"Ahead of the Crowd Academy");
			//driver = CommonClass.SearchWithProviderDetails(driver);
			driver = CommonClass.ValidateMailfunctionality(driver);
			//driver = CommonClass.SearchWithProviderDetails(driver);
			Thread.sleep(3000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
		}
	  
  }
  
  @Test(enabled=false)
  public void BookAppointment_Searchpage(){
	  WebDriver driver = null;
		try {
			driver = CommonClass.launchApplication(driver);
			//driver = CommonClass.NavigateToBasicSearch(driver);
			driver = CommonClass.SearchWithProviderName(driver,"Ahead of the Crowd Academy");
			driver = CommonClass.SearchWithProviderDetails(driver);
			driver = CommonClass.ValidateBookAppointment(driver);
			//driver = CommonClass.SearchWithProviderDetails(driver);
			Thread.sleep(3000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
		}
	  
  }
  @Test(enabled=false)
  public void ValidateProviderDetails(){
	  WebDriver driver = null;
		try {
			driver = CommonClass.launchApplication(driver);
			//driver = CommonClass.NavigateToBasicSearch(driver);
			driver = CommonClass.SearchWithProviderName(driver,"Ahead of the Crowd Academy");
			driver = CommonClass.ValidateProviderDetails(driver, "Ahead of the Crowd Academy");
			//driver = CommonClass.SearchWithProviderDetails(driver);
			Thread.sleep(3000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
		}
	  
  }
  @Test(enabled=false)
  public void BookaAppointment_ProviderDetails(){
	  WebDriver driver = null;
		try {
			driver = CommonClass.launchApplication(driver);
			//driver = CommonClass.NavigateToBasicSearch(driver);
			driver = CommonClass.SearchWithProviderName(driver,"Ahead of the Crowd Academy");
			driver = CommonClass.ValidateProviderDetails_Boooking(driver);
			//driver = CommonClass.SearchWithProviderDetails(driver);
			Thread.sleep(3000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
		}
	  
  }
  
  @Test(enabled=false)
  public void ValidateQualityStarRating(){
	  WebDriver driver = null;
		try {
			driver = CommonClass.launchApplication(driver);
			//driver = CommonClass.NavigateToBasicSearch(driver);
			driver = CommonClass.SearchWithProviderName(driver,"Ahead of the Crowd Academy");
			driver = CommonClass.ValidateQualityRatings(driver);
			//driver = CommonClass.SearchWithProviderDetails(driver);
			Thread.sleep(3000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
		}
	  
  }
  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
