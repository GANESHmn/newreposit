//Login without username and password//
package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Login_TC2 extends Laundry_Base_Class


{
	//@Test(groups = { "Login" })
	@Test
	public void login02() {
		driver2=new ChromeDriver();
		driver2.get(Baseurl);
		driver2.manage().window().maximize();
		driver2.get(Baseurl);
		LoginPage lp=new LoginPage(driver2);
		
		lp.btnclick();
		
		System.out.println(driver2.switchTo().alert().getText());
		

System.out.println("//Login without username and password//");
	


}}

