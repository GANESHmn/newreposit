//Card Page validation without card number//

package com.Laundry.PageObjects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CardsPage_TC2 extends Laundry_Base_Class

{
	@Test(groups = { "PaymentPage" })
	public void PaymentPage3() throws InterruptedException {
		driver2=new ChromeDriver();
		driver2.get(Baseurl);
		driver2.manage().window().maximize();
		LoginPage lp=new LoginPage(driver2);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver2);
		hp.home(ValidZipcode,hp.btndryclean);
		OrdersPage op=new OrdersPage(driver2);
		for(int i=0;i<5;i++)
		{
			op.rightplus.click();
		}
		
		op.rightplus.click();
		op.btncontinue.click();
		op.washed.click();
		op.btncontinue_to_pay.click();
		AddressPage ap=new AddressPage(driver2);
		WebDriverWait wait=new WebDriverWait(driver2,10);
		wait.until(ExpectedConditions.visibilityOf(ap.addaddress));
		ap.addressbox.click();
		JavascriptExecutor js=(JavascriptExecutor)driver2;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		ap.setpickupdate();
		ap.setdeliverydate();
		
		PaymentPage pp=new PaymentPage(driver2);
		JavascriptExecutor je=(JavascriptExecutor)driver2;
		je.executeScript("arguments[0].scrollIntoView(true);",pp.paybtn);
		//r.scardnumbeendKeys(Cardnumber);
		pp.cardexpiry.sendKeys(Cardexpiry);
		pp.cardcvc.sendKeys(cvc);
		pp.paybtn.click();	
		WebDriverWait wait1=new WebDriverWait(driver2,10);
		wait1.until(ExpectedConditions.visibilityOf(pp.paymenterror));
		System.out.println("Error message " +pp.paymenterror.getText());
		
		
	}}
	