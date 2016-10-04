package com.unisys.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScriptInitiatorTest {
  @Test
  public void IntiateScript() {
	  WebDriver driver = null;
		try {
			driver = CommonClass.launchApplication(driver);
			driver = CommonClass.NavigateToBasicSearch(driver);
			driver = CommonClass.SearchWithProviderName(driver,"Ahead of the Crowd Academy");
			Thread.sleep(3000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
