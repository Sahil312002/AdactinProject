package org.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},
glue = {"org\\stepdefinition"} ,
monochrome = true , dryRun=false , strict=true , tags = {"@login"},
plugin = {"pretty" , "json:src\\test\\resources\\Reports\\Cucumber.json"
					,"rerun:src\\test\\resources\\Reports\\Failed.txt"} )

public class TestRunner {

	// ,tags = {"@search"} 
	//glue = {"org\\stepdefinition"} ,
	//, plugin = {"pretty" , "html:src\\test\\resources\\Reports\\Cucumber.html"}
	
	@AfterClass
	  public static void afterClass() {
		 JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Cucumber.json");
	}   

}
