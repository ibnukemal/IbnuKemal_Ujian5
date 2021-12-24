package com.sqa.ibnukemalujian5.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.ibnukemalujian5.driver.DriverSingleton;

public class Dashboard {
	
	private WebDriver driver;
	
	public Dashboard(){
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
	private WebElement btnDresses;
	
	public void clickDresses() {
		btnDresses.click();
	}

}
