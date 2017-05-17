package com.oms.Test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.oms.businesslib.FindOwnersLib;
import com.oms.businesslib.HomePageLib;
import com.oms.commonlib.ConstantClass;
import com.oms.genericlib.Driver;
import com.oms.genericlib.ReporterConfig;
import com.oms.webelementrepositoryCreateOrder.FindOwners;
import com.relevantcodes.extentreports.LogStatus;

public class PetClinicSeleniumTest {

	FindOwnersLib findOwnersLib;
	HomePageLib homePageLib;
	String firstName = "Subrata";
	String lastName = "Fouzder";
	String address = "Bellandur";
	String city = "Bangalore";
	String phoneNumber = "7815009306";
	@BeforeClass
	public void config() throws Exception
	{
		Driver.configChromeDriver();
		findOwnersLib = new FindOwnersLib();
		homePageLib = new HomePageLib();
	}
	
	@BeforeMethod
	public void navigateToApplication(Method testMethod) throws Exception
	{
		homePageLib.navigateToApplicationURL();
		ReporterConfig.logger = ReporterConfig.report.startTest(testMethod.getName());
	}
	
	@Test(priority=1)
	public void addNewOwner() throws Exception
	{
		homePageLib.clickFindOwnersButton();
		findOwnersLib.clickAddNewOwnerButton();
		Thread.sleep(3000);
		findOwnersLib.enterIntoFirstNameInputBox(firstName);
		Thread.sleep(3000);
		findOwnersLib.enterIntoLastNameInputBox(lastName);
		Thread.sleep(3000);
		findOwnersLib.enterIntoAddressInputBox(address);
		Thread.sleep(3000);
		findOwnersLib.enterIntoCityInputBox(city);
		Thread.sleep(3000);
		findOwnersLib.enterIntoPhoneNumberInputBox(phoneNumber);
		Thread.sleep(3000);
		findOwnersLib.clickAddOwnerButtonAfterFillingDetails();
		Thread.sleep(3000);
		findOwnersLib.clickAddNewPet();
		Thread.sleep(3000);
		findOwnersLib.enterIntoPetNameInputBox("tiger");
		Thread.sleep(3000);
		findOwnersLib.enterIntoPetBirthDateInputBox("2017/05/07");
		Thread.sleep(3000);
		findOwnersLib.selectPetType();
		Thread.sleep(3000);
		findOwnersLib.clickAddPetButton();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void finalcall() {
		ReporterConfig.logger.log(LogStatus.INFO, "Test End");
		ReporterConfig.report.endTest(ReporterConfig.logger);
		ReporterConfig.report.flush();
		ConstantClass.globaldriver.get(ReporterConfig.ReportLocation);
	}
	
}
