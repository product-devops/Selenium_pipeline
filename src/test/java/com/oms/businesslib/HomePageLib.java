package com.oms.businesslib;

import org.openqa.selenium.support.PageFactory;

import com.oms.genericlib.Driver;
import com.oms.genericlib.ReporterConfig;
import com.oms.webelementrepositoryCreateOrder.HomePage;
import com.relevantcodes.extentreports.LogStatus;

public class HomePageLib {

	HomePage homePage = PageFactory.initElements(Driver.driver, HomePage.class);
	
	public void navigateToApplicationURL()
	{
		Driver.driver.get("http://localhost:8080/petclinic/");
		ReporterConfig.logger.log(LogStatus.PASS, "Opened the application in browser");
	}
	
	public void clickFindOwnersButton() throws Exception
	{
		homePage.getFindOwners().click();
		ReporterConfig.logger.log(LogStatus.PASS, "Clicked on Find Owners Button");
	}
}
