package org.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Sahil Ghadge\\eclipse-workspace\\AdactinProject\\driver\\chromedriver.exe");
				
		driver = new ChromeDriver();
		return driver;

	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void type(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}
	
	public static void Dropdown(WebElement element,String txt) {
	    Select s=new Select(element);
	    s.selectByVisibleText(txt);

	}
	
	public static void ExplicitWait(WebElement element) {
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5)); //seconds
		
		WebElement loc = w.until(ExpectedConditions.elementToBeClickable(element));
		loc.click();

	}

}
