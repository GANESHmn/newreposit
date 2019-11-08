//Card Page validation with invalid card number//

package com.Laundry.PageObjects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CardsPage_TC3 extends Laundry_Base_Class

{
	@Test(groups = { "PaymentPage" })
	public void PaymentPage3() throws InterruptedException {
		driver3=new ChromeDriver();
		driver3.get(Baseurl);
		driver3.manage().window().maximize();
		LoginPage lp=new LoginPage(driver3);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver3);
		hp.home(ValidZipcode,hp.btndryclean);
		OrdersPage op=new OrdersPage(driver3);
		for(int i=0;i<5;i++)
		{
			op.rightplus.click();
		}		
		op.rightplus.click();
		op.btncontinue.click();
		op.washed.click();
		op.btncontinue_to_pay.click();
		AddressPage ap=new AddressPage(driver3);
		WebDriverWait wait=new WebDriverWait(driver3,10);
		wait.until(ExpectedConditions.visibilityOf(ap.addaddress));
		ap.addressbox.click();
		JavascriptExecutor js=(JavascriptExecutor)driver3;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		ap.setpickupdate();
		ap.setdeliverydate();
		
		PaymentPage pp=new PaymentPage(driver3);
		JavascriptExecutor je=(JavascriptExecutor)driver3;
		je.executeScript("arguments[0].scrollIntoView(true);",pp.paybtn);
		pp.cardnumber.sendKeys(Invalidcardnumber);
		pp.cardexpiry.sendKeys(Cardexpiry);
		pp.cardcvc.sendKeys(cvc);
		Thread.sleep(3000);
		pp.paybtn.click();	
		WebDriverWait wait1=new WebDriverWait(driver3,10);
		wait1.until(ExpectedConditions.visibilityOf(pp.invalid_card_error));
		System.out.println("Error message: " +pp.invalid_card_error.getText());		
	}}
	