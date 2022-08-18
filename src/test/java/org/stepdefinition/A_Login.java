package org.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.base.Utility;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pagemanager.PageManager;
import org.pages.LoginPages;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_Login extends Utility {

	PageManager pm;
	LoginPages lp;
	
	@Given("User is on Adactin Login page.")
	public void user_is_on_Adactin_Login_page() {
		getDriver();
		getUrl("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.manage().window().maximize();
		}

	@When("User enters {string} and {string}")
	public void user_enters_and(String name, String pass) {
		pm = new PageManager();
		lp= pm.getLp();
	    type(lp.getUsername(), name);
	    ExplicitWait(lp.getPassword());
	    type(lp.getPassword(),pass);
	    }

	@Then("User should click on Login Button")
	public void user_should_click_on_Login_Button() throws IOException, InterruptedException {
		btnClick(lp.getLoginBtn());
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Sahil Ghadge\\eclipse-workspace\\AdactinProject\\Screenshots\\A_invalidlogin.png");
		//copy sec to des
		FileUtils.copyFile(src, des);

	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     
		 String expectedtitle ="https://adactinhotelapp.com/HotelAppBuild2/SearchHotel.php";
		  String actualtitle =driver.getCurrentUrl();     
	     Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
		}
	
	@When("User enters username and password")
	public void user_enters_username_and_password() {
		 
		pm = new PageManager();
		lp= pm.getLp();
		type(lp.getUsername(),"sahil3102");
		type(lp.getPassword(),"sahil3105");
	}
	
	@Then("User again click on Login Button")
	public void user_again_click_on_Login_Button() {
		
		btnClick(lp.getLoginBtn());
	//	WebElement lo = driver.findElement(By.id("login"));
	//	btnClick(lo);
	//	lo.click(); 
	}

}
