package com.unisys.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.unisys.objectrepository.AdvanceSearch;
import com.unisys.objectrepository.BasicSearchPage;
import com.unisys.objectrepository.BasicSearchResultPage;
import com.unisys.objectrepository.BookAppointment;
import com.unisys.objectrepository.HomePage;
import com.unisys.objectrepository.MailOverlay;
import com.unisys.objectrepository.ProviderDetails;
import com.unisys.objectrepository.QualityStarRating;

public class CommonClass {
 
  public static WebDriver launchApplication(WebDriver driver) throws InterruptedException{
	   
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile Uleafprofile = profile.getProfile("Selenium_User");					
		driver = new FirefoxDriver(Uleafprofile);
		driver.manage().window().maximize();
		//driver = new FirefoxDriver();
		//driver.get("http://ustr-erl-5411.na.uis.unisys.com:8080/mscws-portal/resources/app/index.html");
		//driver.get("http://192.62.156.35:8080/mscws-portal/resources/index.html#/");
		driver.get("http://192.62.156.35:8080/mscws-portal-api/resources/index.html#/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		return driver;
	}	
  
   // Basic Search - Searching by provider Name
	public static WebDriver SearchWithProviderName(WebDriver driver, String providerName) throws InterruptedException{
		BasicSearchPage.ProviderName(driver).sendKeys(providerName);
		Thread.sleep(4000);
		BasicSearchPage.SearchBtn(driver).click();	
		Thread.sleep(3000);
		//html/body/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[1]/h4/b
		//String DisplayedName = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/h4/b")).getText();
		//String DisplayedName = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div[3]/div[2]/div[2]/div[1]/div[1]/h4/b")).getText();
		
		String DisplayedName = driver.findElement(By.xpath("//div[3]/div[1]/div[1]/h4/b")).getText();
		Assert.assertEquals(DisplayedName, "Ahead of the Crowd Academy");		
		if (DisplayedName.contains("Ahead of the Crowd Academy")){
			System.out.println("Provider Name displayed correctly: Displayed Name "+ DisplayedName);
		
		}				
		else
			System.out.println("Incorrect Provider Name displayed. Expected provider Name:  Ahead of the Crowd Academy. Actual Provider Name displayed : "+DisplayedName);
					
		System.out.println(driver.getTitle());
		return driver;
	} 
	
	// Basic Search - Searching by provider Name
	public static WebDriver SearchWithProviderDetails(WebDriver driver) throws InterruptedException{
		/*BasicSearchPage.ProviderName(driver).sendKeys(providerName);
		Thread.sleep(2000);*/
		
		Select Option1 = new Select(BasicSearchPage.City(driver)); 
		Option1.selectByIndex(1);		
		BasicSearchPage.SearchBtn(driver).click();	
		Thread.sleep(3000);		
		String DisplayedName = driver.findElement(By.xpath("//div[3]/div[1]/div[1]/h4/b")).getText();
		Assert.assertEquals(DisplayedName, "A Bright Beginning II");		
		if (DisplayedName.contains("A Bright Beginning II")){
			System.out.println("Provider Name displayed correctly: Displayed Name "+ DisplayedName);
		}				
		else
		{
			System.out.println("Incorrect Provider Name displayed. Expected provider Name:  A Bright Beginning II. Actual Provider Name displayed : "+DisplayedName);
		}
		System.out.println(driver.getTitle());
		return driver;
	} 
	
	public static WebDriver ValidateMailfunctionality(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);	
		BasicSearchResultPage.MailBox1(driver).click();
		Thread.sleep(3000);	
		MailOverlay.from(driver).sendKeys("sibaram.samal@in.unisys.com");
		//MailOverlay.to(driver).sendKeys("provider@provider.com");
		MailOverlay.subject(driver).sendKeys("Confrming vendor details");
		MailOverlay.message(driver).sendKeys("Please provide the details");
		MailOverlay.sendBtn(driver).click();
		Thread.sleep(3000);
		String messageSendStatus = MailOverlay.emailStatus(driver).getText();
		Assert.assertEquals(messageSendStatus, "Email Sent Successfully.");
		if (messageSendStatus.equals("Email Sent Successfully.")){
			System.out.println("PASS: Message sent successfully");
		}
		else
		{
			System.out.println("FAIL: wrong message sent status displayed : - "+messageSendStatus);
		}
		MailOverlay.emailStatus_OkBtn(driver).click();
		Thread.sleep(3000);		
		return driver;
	}
	public static WebDriver UpdateAppointmentDetails(WebDriver driver) throws InterruptedException{
		BookAppointment.FirstName(driver).sendKeys("Sibaram");
		BookAppointment.LastName(driver).sendKeys("Samal");
		BookAppointment.Address(driver).sendKeys("TEST");
		Select AddOptn1 = new Select(BookAppointment.AddressOption1(driver));
		AddOptn1.selectByIndex(0);
		Select AddOptn2 = new Select(BookAppointment.AddressOption1(driver));
		AddOptn2.selectByIndex(1);
		Select AddOptn3 = new Select(BookAppointment.AddressOption1(driver));
		AddOptn3.selectByIndex(1);
		BookAppointment.ZIPCODE(driver).sendKeys("500016");
		BookAppointment.EmailID(driver).sendKeys("Sibaram.samal@in.unisys.com");
		BookAppointment.TelephoneNumber(driver).sendKeys("+91900090000");
		BookAppointment.Date(driver).sendKeys("10/17/2016 7:00 AM");
		Select NoOfChild = new Select(BookAppointment.NoOfChildren(driver));
		NoOfChild.selectByIndex(1);
		BookAppointment.RequestAppointment_Btn(driver).click();
		Thread.sleep(2000);
		String ConfMsg = BookAppointment.BookingConfirmationStatusmsg(driver).getText();
		Assert.assertEquals(ConfMsg, "Your request for booking an appointment has been received and someone will be in touch with you shortly.");
		if(ConfMsg.equalsIgnoreCase("Your request for booking an appointment has been received and someone will be in touch with you shortly."))
			System.out.println("PASS: Booking confirmed successfully");
		else
			System.out.println("FAIL: Booking not confirmed. Status message displayed as "+ConfMsg);
		BookAppointment.BookingConfirmationOk_btn(driver).click();		
		Thread.sleep(2000);
		return driver;
	}
	
	public static WebDriver ValidateBookAppointment(WebDriver driver) throws InterruptedException{
		BasicSearchResultPage.BookAppointment_Btn(driver).click();
		Thread.sleep(2000);
		driver = CommonClass.UpdateAppointmentDetails(driver);
		return driver;
	}
	public static WebDriver ValidateProviderDetails(WebDriver driver, String providerName) throws InterruptedException{
		BasicSearchResultPage.MoreDetails_Btn(driver).click();
		Thread.sleep(2000);
		String Prvdname = ProviderDetails.ProviderName(driver).getText();
		Assert.assertEquals(Prvdname, providerName);
		if(Prvdname.equalsIgnoreCase(providerName))
			System.out.print("Provider name displayed correctly");
		else
			System.out.print("Provider name displayed correctly");
		ProviderDetails.Back_btn(driver).click();
		return driver;
	} 
	
	public static WebDriver ValidateProviderDetails_Boooking(WebDriver driver) throws InterruptedException{
		BasicSearchResultPage.MoreDetails_Btn(driver).click();
		Thread.sleep(2000);
		ProviderDetails.BookAppointment_Btn(driver).click();
		Thread.sleep(2000);
		driver = CommonClass.UpdateAppointmentDetails(driver);
		ProviderDetails.Back_btn(driver).click();
		return driver;
	} 
	
	public static WebDriver ValidateQualityRatings(WebDriver driver) throws InterruptedException{
		BasicSearchResultPage.QualityRating(driver).click();
		Thread.sleep(2000);
		QualityStarRating.Expand_btn(driver).click();
		Thread.sleep(2000);
		String AdminPolicy = QualityStarRating.AdminPolicy(driver).getText();
		Assert.assertEquals(AdminPolicy, "Administrative Policy");
		if(AdminPolicy.equalsIgnoreCase( "Administrative Policy"))
			System.out.print("Quality Star ratings displayed correctly");
		else
			System.out.print("Quality Star ratings displayed incorrectly. Displayed Policy : "+AdminPolicy);
		return driver;
	}
	public static WebDriver ValidateAdvanceSearch(WebDriver driver) throws InterruptedException{
		Select Option1 = new Select(BasicSearchPage.City(driver)); 
		Option1.selectByIndex(1);	
		BasicSearchPage.AdvnSrch(driver).click();
		Thread.sleep(2000);		
		AdvanceSearch.TimeOfServiceProvided(driver).click();
		AdvanceSearch.HandicapAccessibility(driver).click();
		AdvanceSearch.EmotionallyDisturbed(driver).click();
		AdvanceSearch.MentallyImpaired(driver).click();
		BasicSearchPage.SearchBtn(driver).click();	
		Thread.sleep(2000);
		String DisplayedName = driver.findElement(By.xpath("//div[3]/div[1]/div[1]/h4/b")).getText();
		Assert.assertEquals(DisplayedName, "Elva Castillo");		
		if (DisplayedName.contains("Elva Castillo")){
			System.out.println("Provider Name displayed correctly: Displayed Name "+ DisplayedName);
		}				
		else
		{
			System.out.println("Incorrect Provider Name displayed. Expected provider Name:  Ahead of the Crowd Academy. Actual Provider Name displayed : "+DisplayedName);
		}
		System.out.println(driver.getTitle());
		return driver;		
	}
	public static WebDriver ValidateMapView(WebDriver driver) throws InterruptedException{
		
		return driver;
	}
	public static WebDriver ValidateFilterandSort(WebDriver driver) throws InterruptedException{
		return driver;
	}
	public static WebDriver ValidateMultiLanguage(WebDriver driver) throws InterruptedException{
		return driver;
	}
	
}
