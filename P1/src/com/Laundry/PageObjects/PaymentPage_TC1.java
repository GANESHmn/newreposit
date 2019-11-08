//**Valid Payment Test**//
package com.Laundry.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PaymentPage_TC1 extends Laundry_Base_Class

{
	@Test(groups = { "PaymentPage" })
	public void PaymentPage1() throws InterruptedException {
	
		driver.get(Baseurl);
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver);
		hp.home(ValidZipcode,hp.btnIroning);
		OrdersPage op=new OrdersPage(driver);
		for(int i=1;i<4;i++)
		{
			op.rightplus.click();
		}
		
		op.rightplus.click();
		op.btncontinue.click();
		op.washed.click();
		op.btncontinue_to_pay.click();
		AddressPage ap=new AddressPage(driver);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ap.addaddress));
		ap.addressbox.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		ap.setpickupdate();
		ap.setdeliverydate();
		
		PaymentPage pp=new PaymentPage(driver);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);",pp.paybtn);
		pp.cardnumber.sendKeys(Cardnumber);
		pp.cardexpiry.sendKeys(Cardexpiry);
		pp.cardcvc.sendKeys(cvc);
		pp.paybtn.click();	
		Thread.sleep(3000);
		System.out.println("Order completed successfully");
		
}}
	