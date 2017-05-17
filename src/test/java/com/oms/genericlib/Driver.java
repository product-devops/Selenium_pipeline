
package com.oms.genericlib;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.oms.commonlib.ConstantClass;

public class Driver{
                
                static ConstantClass CC = new ConstantClass();
                public static WebDriver driver;
                public static WebDriver configChromeDriver() throws Exception
                {
                	System.setProperty("webdriver.chrome.driver", ConstantClass.chromeDriverPath);
                  
                  ChromeOptions options = new ChromeOptions();
                  options.setBinary(ConstantClass.chromeDriverPath);

                //ChromeDriver driver = new ChromeDriver(options);
            		//ChromeOptions options = new ChromeOptions();
            		//options.addExtensions(new File(ConstantClass.joshuaExtnPath));
            		//DesiredCapabilities capabilities = new DesiredCapabilities();
            		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            		//driver = new ChromeDriver(capabilities);
                driver = new ChromeDriver(options);
            		driver.manage().window().maximize();
            		driver.manage().deleteAllCookies();
            		ReporterConfig.intialiseconfig();
                ConstantClass.globaldriver=driver;
                	return driver;
                }
}

