package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String jsonFile ) {
		
		
	File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
	
	Configuration con = new Configuration(loc , "Adactin Automation");
	con.addClassifications("Browser Name", "Chrome");
	con.addClassifications("Browser version", "104");
	con.addClassifications("os", "windows");
	con.addClassifications("Testing", "Regression");
	
	List<String> jsonfiles = new ArrayList<String>();
	jsonfiles.add(jsonFile);
	
	ReportBuilder builder = new ReportBuilder(jsonfiles,con);
	
	builder.generateReports();
	
	}
	
}
