package com.Yosi;

import org.testng.annotations.Test;

public class Registration extends Yosi_Base_Class{

	@Test
	public void registration()
	{
		Patient_Information_Page1 pip=new Patient_Information_Page1(driver);
		//pip.registration.click();
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
}
