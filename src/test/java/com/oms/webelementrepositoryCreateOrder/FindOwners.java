package com.oms.webelementrepositoryCreateOrder;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindOwners {

	@FindBy(xpath = "//a[contains(text(),'Add Owner')]")
	private WebElement addOwnerButton;

	public WebElement getAddOwnerButton() {
		return addOwnerButton;
	}
	
	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstNameInputBox;
	
	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lastNameInputBox;
	
	@FindBy(xpath = "//input[@id='address']")
	private WebElement addressInputBox;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityInputBox;
	
	@FindBy(xpath = "//input[@id='telephone']")
	private WebElement phoneNumberInputBox;
	
	@FindBy(xpath = "//button[contains(text(),'Add Owner')]")
	private WebElement addOwnerButtonAfterFillingDetails;

	public WebElement getFirstNameInputBox() {
		return firstNameInputBox;
	}

	public WebElement getLastNameInputBox() {
		return lastNameInputBox;
	}

	public WebElement getAddressInputBox() {
		return addressInputBox;
	}

	public WebElement getCityInputBox() {
		return cityInputBox;
	}

	public WebElement getPhoneNumberInputBox() {
		return phoneNumberInputBox;
	}

	public WebElement getAddOwnerButtonAfterFillingDetails() {
		return addOwnerButtonAfterFillingDetails;
	}
	
	@FindBy(xpath  = "//a[contains(text(),'Add New Pet')]")
	private WebElement addNewPet;

	public WebElement getAddNewPet() {
		return addNewPet;
	}
	
	public WebElement getPetTypeDropdown() {
		return petTypeDropdown;
	}

	@FindBy(xpath = "//input[@id='name']")
	private WebElement petNameInputBox;

	public WebElement getPetNameInputBox() {
		return petNameInputBox;
	}
	
	@FindBy(xpath = "//input[@id='birthDate']")
	private WebElement birthDateInputBox;

	public WebElement getBirthDateInputBox() {
		return birthDateInputBox;
	}
	
	@FindBy(xpath = "//select[@name='type']")
	private WebElement petTypeDropdown;
	
	@FindBy(xpath = "//button[contains(text(),'Add Pet')]")
	private WebElement addPetButton;

	public WebElement getAddPetButton() {
		return addPetButton;
	}
}
