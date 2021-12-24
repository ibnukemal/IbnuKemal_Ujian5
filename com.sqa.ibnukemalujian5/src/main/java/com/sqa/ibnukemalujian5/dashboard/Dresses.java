package com.sqa.ibnukemalujian5.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.ibnukemalujian5.driver.DriverSingleton;

public class Dresses {

	private WebDriver driver;
	
	public Dresses() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = "#center_column > ul > li:nth-child(2) > div > div.right-block > div.button-container")
	private WebElement addChart;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	private WebElement gotoCheckOut;
	
	public void selectItems() {
		addChart.click();
		gotoCheckOut.click();
	}
	
	
	
}
