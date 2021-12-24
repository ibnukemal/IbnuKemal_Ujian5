package com.sqa.ibnukemalujian5.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.ibnukemalujian5.driver.DriverSingleton;

public class CheckOut {
	
	private WebDriver driver;
	
	public CheckOut() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")
	private WebElement proceedCheckOut;
	
	@FindBy(css="#center_column > form > p > button")
	private WebElement processAddress;
	
	@FindBy(id="cgv")
	private WebElement agreement;
	
	@FindBy(css = "#form > p > button")
	private WebElement processShipping;
	
	@FindBy(css= "#HOOK_PAYMENT > div:nth-child(2) > div")
	private WebElement payMethod;
	
	@FindBy(css = "#cart_navigation > button")
	private WebElement btnConfirm;
	
	public void checkoutProceed() {
		proceedCheckOut.click();
	}
	
	public void addressCheckOut() {
		processAddress.click();
	}
	
	public void shipping() {
		agreement.click();
		processShipping.click();
	}
	
	public void payment() {
		payMethod.click();
	}
	
	public void confirm() {
		btnConfirm.click();
	}
	
}
