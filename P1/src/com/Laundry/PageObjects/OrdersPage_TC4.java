package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrdersPage_TC4 extends Laundry_Base_Class{
	@Test(priority=1)
	public void OrdersPage1() throws InterruptedException {
		driver4=new ChromeDriver();
		driver4.get(Baseurl);
		driver4.manage().window().maximize();
		HomePage hp=new HomePage(driver4);
		hp.home(ValidZipcode,hp.btndryclean);
		OrdersPage op=new OrdersPage(driver4);
		
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver4,10);
		wait.until(ExpectedConditions.visibilityOf(op.rightplus));
		op.rightplus.click();
		
		op.btncontinue.click();
		driver4.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		op.washed.click();
		op.btncontinue_to_pay.click();
		
		String alertmsg=op.minorderalert.getText();
		
			System.out.println("Alert is " +alertmsg);

	}
@Test(priority=2)
public void OrdersPage2() throws InterruptedException {

	
	HomePage hp=new HomePage(driver4);
	hp.home(ValidZipcode,hp.btnshirts);
	hp.btnwomens.click();
	Thread.sleep(3000);
	OrdersPage op=new OrdersPage(driver4);
	WebDriverWait wait=new WebDriverWait(driver4,10);
	wait.until(ExpectedConditions.visibilityOf(op.wrightplus));
	
	op.wrightplus.click();
	
	op.btncontinue.click();
	driver4.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	op.washed.click();
	op.btncontinue_to_pay.click();
	
	String alertmsg=op.minorderalert.getText();
	
		System.out.println("Alert is " +alertmsg);
}
@Test(priority=3)
public void OrdersPage3() throws InterruptedException {

	
	HomePage hp=new HomePage(driver4);
	hp.home(ValidZipcode,hp.btnIroning);
	
	OrdersPage op=new OrdersPage(driver4);
	hp.btnkids.click();
	Thread.sleep(3000);
	WebDriverWait wait=new WebDriverWait(driver4,10);
	wait.until(ExpectedConditions.visibilityOf(op.krightplus));
	op.krightplus.click();
	
	op.btncontinue.click();
	driver4.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	op.washed.click();
	op.btncontinue_to_pay.click();
	
	String alertmsg=op.minorderalert.getText();
	
		System.out.println("Alert is " +alertmsg);
}}
	