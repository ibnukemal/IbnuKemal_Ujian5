package com.sqa.ibnukemalujian5.signin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sqa.ibnukemalujian5.driver.DriverSingleton;

public class SignIn {

	private WebDriver driver;
	
	public SignIn() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnSignIn;
	
	@FindBy(id = "email_create")
	private WebElement txtBoxEmail;
	
	@FindBy(id = "SubmitCreate")
	private WebElement btnSubmit;
	
	public void menuSignIn() {
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(btnSignIn));
		btnSignIn.click();
	}
	
	public void createEmail(String email_create) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		txtBoxEmail.sendKeys(email_create);
		js.executeScript("window.scrollBy(0, 400)");
		btnSubmit.click();
		
	}
	
}
