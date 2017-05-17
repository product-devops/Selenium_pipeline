package com.oms.webelementrepositoryCreateOrder;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//span[contains(text(),'Find owners')]")
	private WebElement findOwners;

	public WebElement getFindOwners() {
		return findOwners;
	}
	
}
