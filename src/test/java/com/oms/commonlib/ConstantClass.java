package com.oms.commonlib;

import java.io.File;

import org.openqa.selenium.WebDriver;


public class ConstantClass {
	
	
	// Application URL
	
	public static String joshuaExtnPath = ".\\extensions\\chrome-ext.crx";
	public static String chromeDriverPath = "/usr/bin/chromedriver";

	public static WebDriver globaldriver;

	
	//
	public static final File projectDir =  new File(System.getProperty("user.dir"));

}
