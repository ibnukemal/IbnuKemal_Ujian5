package com.sqa.ibnukemalujian5.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.sqa.ibnukemalujian5.dashboard.CheckOut;
import com.sqa.ibnukemalujian5.dashboard.Dashboard;
import com.sqa.ibnukemalujian5.dashboard.Dresses;
import com.sqa.ibnukemalujian5.driver.DriverSingleton;
import com.sqa.ibnukemalujian5.regist.FormRegist;
import com.sqa.ibnukemalujian5.signin.SignIn;

public class MainApps {

	public static void main(String[] args) {
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/index.php");
		
		SignIn signin = new SignIn();
		signin.menuSignIn();
		signin.createEmail("hellodemos@example.com");
		
		
		FormRegist regist = new FormRegist();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 50)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//FormPersonal
		regist.selectGreetings(1);
		regist.formPersonal("Derry", "Hernandez", "superveloce");
//		//DOB
		regist.dateOfBirth(4);
		regist.monthOfBirth(7);
		regist.yearOfBirth(22);
		//Form Address
		js.executeScript("window.scrollBy(0, 400)");
		regist.formAddress("Rockstar", "Compton", "Grove Street", "Los Angeles", "99032","0423243435");
		regist.listState(5);
		js.executeScript("window.scrollBy(0, 500)");
		regist.listCountry(21);
		regist.clickRegister();
		
		Dashboard dashboard = new Dashboard();
		dashboard.clickDresses();
		
		Dresses dresses = new Dresses();
		js.executeScript("window.scrollBy(0, 1000)");
		dresses.selectItems();
		
		CheckOut cart = new CheckOut();
		js.executeScript("window.scrollBy(0, 1000)");
		cart.checkoutProceed();
		js.executeScript("window.scrollBy(0, 1000)");
		cart.addressCheckOut();
		cart.shipping();
		js.executeScript("window.scrollBy(0, 1000)");
		cart.payment();
		js.executeScript("window.scrollBy(0, 600)");
		cart.confirm();
	}
}
