package com.sqa.ibnukemalujian5.regist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sqa.ibnukemalujian5.driver.DriverSingleton;


public class FormRegist {

	private WebDriver driver;
	
	public FormRegist() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//radio button greetings
	@FindBy(css="#id_gender1")
	public WebElement checkGender1;
	
	@FindBy(css="id_gender2")
	public WebElement checkGender2;
	
	//isi form
	@FindBy(id = "customer_firstname")
	public WebElement txtFirstName;
	@FindBy(id = "customer_lastname")
	public WebElement txtLastName;
	@FindBy(id = "passwd")
	public WebElement txtPassword;
	
	//list DOB
	@FindBy(css = "#days")
	public WebElement days;
	@FindBy(css = "#months")
	public WebElement months;
	@FindBy(css = "#years")
	public WebElement year;
	
	//form address
	@FindBy(id = "company")
	public WebElement txtCompany;
	@FindBy(id = "address1")
	public WebElement txtAddress1;
	@FindBy(id = "address2")
	public WebElement txtAddress2;
	@FindBy(id = "city")
	public WebElement txtCity;
	@FindBy(id = "id_state")
	public WebElement state;
	@FindBy(id = "postcode")
	public WebElement txtPostcode;
	@FindBy(id = "id_country")
	public WebElement idCountry;
	@FindBy(id = "phone_mobile")
	public WebElement txtMobilePhone;
	@FindBy(id = "submitAccount")
	public WebElement btnRegister;
	
	
	public void selectGreetings(int gender) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50)");
		if (gender == 1) {
			checkGender1.click();
		} else {
			checkGender2.click();
		}
	}
	
	public void formPersonal(String customer_firstname, String customer_lastname, String passwd) {
		txtFirstName.sendKeys(customer_firstname);
		txtLastName.sendKeys(customer_lastname);
		txtPassword.sendKeys(passwd);
	}
	
	public void dateOfBirth(int selection) {

		days.click();
	
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void monthOfBirth(int selection) {
		
		months.click();
	
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void yearOfBirth(int selection) {

		year.click();
	
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void formAddress(String company, String address1, String address2, String city, 
	String postcode, String phone_mobile) {
		txtCompany.sendKeys(company);
		txtAddress1.sendKeys(address1);
		txtAddress2.sendKeys(address2);
		txtCity.sendKeys(city);
		txtPostcode.sendKeys(postcode);
		txtMobilePhone.sendKeys(phone_mobile);
	}
	
	public void listState(int selection) {
		state.click();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	
	}
	
	public void listCountry(int selection) {
		idCountry.click();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void clickRegister() {
		btnRegister.click();
	}
	
}

