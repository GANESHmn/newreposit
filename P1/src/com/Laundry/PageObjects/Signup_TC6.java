//Signup test with existing user//

package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


	public class Signup_TC6 extends Laundry_Base_Class

	{
		@Test(groups = { "Signup" })
		public void SignupTest() throws InterruptedException {
			
			driver6=new ChromeDriver();			
			driver6.manage().window().maximize();
			driver6.get(Baseurl);
			SignupPage sp=new SignupPage(driver6);
			sp.alreadyuserlogin();
			driver6.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			sp.createnew();
			sp.setname(Name);
			sp.setemail1(username);
			sp.setpassword1(Password);
		    sp.setconfpwd(Password);
		    sp.setmobile(Mobile);
		    sp.termsandcond();
			sp.btnclick();
			Thread.sleep(3000);
			sp.setOtp(InvalidOtp);
			Thread.sleep(4000);
			WebElement label=driver.findElement(By.xpath("//*[@id=\"name\"]"));
			label.sendKeys("name");
			String currentWindow = driver.getWindowHandle();
	        driver.switchTo().window(currentWindow);
			System.out.print(label.getText());
			driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/form/div[7]/label")).click();
			
			sp.Duplicatealert();
			WebDriverWait wait=new WebDriverWait(driver6,10);
			wait.until(ExpectedConditions.alertIsPresent());			
			System.out.println("\n signup_TC6 "+ driver6.switchTo().alert().getText());	
		}


	}
