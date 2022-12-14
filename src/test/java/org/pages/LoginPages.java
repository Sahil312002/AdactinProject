package org.pages;

import org.base.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages extends Utility {

	public LoginPages() {
		PageFactory.initElements(driver, this);
	}
	

	@CacheLookup
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement LoginBtn;
	
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	
	
}
