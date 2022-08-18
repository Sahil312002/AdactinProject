package org.testng;

import org.base.Utility;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.pages.LoginPages;


public class TestngClass extends Utility {

	@Test
	@Parameters({"UserName","Password"})
	public void param1(String name,String credentials) {
		getDriver();
		getUrl("https://adactinhotelapp.com/index.php");
        driver.findElement(By.id("username")).sendKeys(name);
        driver.findElement(By.id("password")).sendKeys(credentials);
        LoginPages lp=new LoginPages();
        btnClick(lp.getLoginBtn());
	}

}
