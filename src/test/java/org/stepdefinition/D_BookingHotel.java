package org.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.base.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.pagemanager.PageManager;
import org.pages.BookingHotelPages;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D_BookingHotel extends Utility{

	PageManager pm;
	BookingHotelPages bh;
	
	
	@Given("User is on BookAHotel page.")
	public void user_is_on_BookAHotel_page() throws IOException, InterruptedException {
		String expectedtitle ="https://adactinhotelapp.com/HotelAppBuild2/BookHotel.php";
		  String actualtitle =driver.getCurrentUrl();     
	      Assert.assertEquals(actualtitle, expectedtitle);
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     
	  	TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Sahil Ghadge\\eclipse-workspace\\AdactinProject\\Screenshots\\G_addedbookingdetails.png");
		//copy sec to des
		FileUtils.copyFile(src, des);
		Thread.sleep(2000);
		
	
	}

	
	@When("User enters firstname,lastname,billing address and credit card number")
	public void user_enters_firstname_lastname_billing_address_and_credit_card_number() {
		pm=new PageManager();
		bh=pm.getBh();
	    WebElement fname=bh.getFname();
	    WebElement lname=bh.getLname();
	    WebElement add=bh.getAddress();
	    WebElement card=bh.getCardno();
	    type(fname,"Capgemini");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    type(lname,"team6");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    type(add,"St Thomas Road, Churchgate Mumbai");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    type(card,"2111111111111111");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 }

	
	@When("User selects credit card type and expiry date")
	public void user_selects_credit_card_type_and_expiry_date() {
		
	    WebElement ct=bh.getCardtype();
		WebElement m=bh.getExpmonth();
		WebElement y=bh.getExpyear();
	    Dropdown(ct,"VISA");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    Dropdown(m,"October");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    Dropdown(y,"2022");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}

	
	@When("User enters CVV number")
	public void user_enters_CVV_number() throws IOException, InterruptedException {
	
	    WebElement cvv=bh.getCvv();
		type(cvv,"123");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Sahil Ghadge\\eclipse-workspace\\AdactinProject\\Screenshots\\H_addedbookingdetails.png");
		//copy sec to des
		FileUtils.copyFile(src, des);
		Thread.sleep(2000);
		
	
	}

	@Then("User should click on Book Now Button.")
	public void user_should_click_on_Book_Now_Button() throws InterruptedException {
	    
	    WebElement btn=bh.getBookbtn();
		btnClick(btn);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		}
	
	@Then("User will click on My Itinerary Button")
	public void user_will_click_on_My_Itinerary_Button() throws InterruptedException {
	
		Thread.sleep(5000);
	 WebElement my = driver.findElement(By.id("my_itinerary"));
	 my.click();
	}


}
