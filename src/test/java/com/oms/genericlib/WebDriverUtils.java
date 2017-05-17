package com.oms.genericlib;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oms.commonlib.ConstantClass;


public class WebDriverUtils {
	static Robot robot;
	static boolean status = true;
	public static void waitForPageToLoad(){
	Driver.driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
	
	}
	
	public static void waitForLinkTextPresent(String linkName){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkName)));
		
	}
	
	public static void waitForButtonPresent(WebElement weButton){

		   WebDriverWait wait = new WebDriverWait(Driver.driver, 60);
		   wait.until(ExpectedConditions.visibilityOf(weButton));
	}
		   
	 public static void scrollToBottom(WebDriver driver) {
	        ((JavascriptExecutor) driver)
	                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void waitForXpathPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(wbXpath)));
	}
	
	public static void waitForElementPresent(WebElement wbElement){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(wbElement));
	}

	public static boolean verifyText(String wbXpath , String expectedText){
		boolean flag= false;
		String actText = Driver.driver.findElement(By.xpath(wbXpath)).getText();
		if(expectedText.equals(actText)){
			flag=true;
			System.out.println(expectedText + "=text is verified==>PASS");
		}else{
			System.out.println(expectedText + "=text is not verified==>FAIL");
	
		}
		return flag;
	}
	
	public static void select(String wbName , String visbleText){
		Select sel = new Select(Driver.driver.findElement(By.name(wbName)));
		sel.selectByVisibleText(visbleText);
	}
	
	public static void select(String wbName , int index){
		Select sel = new Select(Driver.driver.findElement(By.name(wbName)));
		sel.selectByIndex(index);
	}
	
	public static void select(WebElement wb , String value){
		Select sel = new Select(wb);
		sel.selectByVisibleText(value);
	}
	
	
	
	public static void aceptAlert(){
		Alert alt = Driver.driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	public static void dismissAlert(){
		Alert alt = Driver.driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}
	
	public static void mouseOver(String wbxpath){
		WebElement wb = Driver.driver.findElement
				                       (By.xpath(wbxpath));
		Actions act = new Actions(Driver.driver);
		act.moveToElement(wb).perform();
		
	}
	
	public static void configRobot()
	{
		try {
			robot=new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void clickEscape()
	{
		configRobot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
	}
	public static void KeyboardEnter(){
		configRobot();
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
