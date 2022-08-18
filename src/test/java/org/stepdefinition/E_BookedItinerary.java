	package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.base.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pagemanager.PageManager;
import org.pages.BookedItineraryPages;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class E_BookedItinerary extends Utility {

	PageManager pm;
	BookedItineraryPages bi;

@Given("User is on BookedItinerary Page.")
public void user_is_on_BookedItinerary_Page() throws IOException, InterruptedException {
	String expectedtitle ="https://adactinhotelapp.com/HotelAppBuild2/BookedItinerary.php";
	String actualtitle =driver.getCurrentUrl();     
    Assert.assertEquals(actualtitle, expectedtitle);	
	Assert.assertTrue(true);
	Thread.sleep(2000);
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src=tk.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Sahil Ghadge\\eclipse-workspace\\AdactinProject\\Screenshots\\I_bookedItinerarypage.png");
	//copy sec to des
	FileUtils.copyFile(src, des);
	Thread.sleep(2000);
	

}

@When("User will Copy order id of first record")
public void user_will_Copy_order_id_of_first_record() throws AWTException, InterruptedException {
	pm=new PageManager();
	   bi=pm.getBi();
	   WebElement fr = bi.getFirstrec();
	   Actions ac= new Actions(driver);
	   ac.moveToElement(fr).doubleClick().build().perform();
	   Robot r = new Robot();
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_C);
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_C); 

		Thread.sleep(2000);
//	Assert.assertTrue(true);
	   }

@When("User will paste the OrderId")
public void user_will_paste_the_OrderId() throws AWTException, InterruptedException {
	//  WebElement sb = bi.getSearchoi();
	//  sb.click();
	pm=new PageManager();
	   bi=pm.getBi();
	   
	btnClick(bi.getSearchoi());
	  Robot r = new Robot();
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_V);  
	   }

@Then("User should click on Go Button.")
public void user_should_click_on_Go_Button() throws AWTException, IOException, InterruptedException {
	pm=new PageManager();
	   bi=pm.getBi();
	bi.getGobtn().click();  
	
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src=tk.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Sahil Ghadge\\eclipse-workspace\\AdactinProject\\Screenshots\\J_specificsearch.png");
	//copy sec to des
	FileUtils.copyFile(src, des);
	Thread.sleep(2000);
	
//	Assert.assertTrue(true);
	}

@When("User clicks on Cancel Selected Button")
public void user_clicks_on_Cancel_Selected_Button() {
	 pm=new PageManager();
	 bi=pm.getBi();
	 
	 bi.getChbox().click();
     bi.getCansel().click();
     
//	Assert.assertTrue(true);
     }

@Then("User should click on OK Button.")
public void user_should_click_on_OK_Button() throws InterruptedException {
	Alert al = driver.switchTo().alert();
	al.accept();
	
	Thread.sleep(2000);
	
	driver.quit();
//	Assert.assertTrue(true);
}

}
