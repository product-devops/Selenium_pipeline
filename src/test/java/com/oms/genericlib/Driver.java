
package com.oms.genericlib;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;


import com.oms.commonlib.ConstantClass;

public class Driver{
                
                static ConstantClass CC = new ConstantClass();
                public static WebDriver driver;
                //public static FirefoxBinary driver;
                public static WebDriver configChromeDriver() throws Exception
                {
                	//System.setProperty("webdriver.chrome.driver", ConstantClass.chromeDriverPath);
                  System.setProperty("webdriver.PhantomJS.driver", ConstantClass.PhantomJsPath);
                  options.setBinary(ConstantClass.PhantomJsPath);
                  
                  //ChromeOptions options = new ChromeOptions();
                  //options.setBinary(ConstantClass.chromeDriverPath);
                  //FirefoxBinary fb = new FirefoxBinary(); 
                  //fb.setEnvironmentProperty("DISPLAY", ":0"); 
                  driver = new PhantomJSDriver(); 
                //ChromeDriver driver = new ChromeDriver(options);
            		//ChromeOptions options = new ChromeOptions();
            		//options.addExtensions(new File(ConstantClass.joshuaExtnPath));
            		//DesiredCapabilities capabilities = new DesiredCapabilities();
            		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            		//driver = new ChromeDriver(capabilities);
                //driver = new ChromeDriver(options);
            		driver.manage().window().maximize();
            		driver.manage().deleteAllCookies();
            		ReporterConfig.intialiseconfig();
                ConstantClass.globaldriver=driver;
                	return driver;
                }
}

