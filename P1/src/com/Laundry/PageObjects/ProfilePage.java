package com.Laundry.PageObjects;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

	public class ProfilePage {

		WebDriver ldriver;
		
		ProfilePage(WebDriver rdriver)
		
		{
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"name\"]")
		@CacheLookup
		WebElement txtname;
		@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
		@CacheLookup
		WebElement txtemail;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"mobile\"]")
		@CacheLookup
		WebElement txtphone;
		@FindBy(how = How.XPATH, using = "/html/body/section/div/div[2]/div[2]/div/div[2]/form/div[4]/button[1]")
		@CacheLookup
		WebElement btnsave;
		@FindBy(how = How.XPATH, using = "/html/body/section/div/div[2]/div[2]/div/div[2]/form/div[4]/button[2]")
		@CacheLookup
		WebElement btncancel;
		@FindBy(how = How.XPATH, using = "/html/body/section/div/div[2]/div[1]/div[2]/div[2]")
		@CacheLookup
		WebElement myorders;
		
		@FindBy(how = How.XPATH, using = "/html/body/section/div/div[2]/div[1]/div[2]/div[3]/a/h4") // /html/body/section/div/div[2]/div[1]/div[2]/div[3]/a/h4
        @CacheLookup                     
		WebElement myaddress;
		
		@FindBy(how = How.XPATH, using = "/html/body/section/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/span[1]/a/i")
		@CacheLookup
		WebElement editaddress;
		
		
		@FindBy(how = How.XPATH, using = "/html/body/section/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div/span[2]/a/i")
		@CacheLookup
		WebElement deleteaddress;
		@FindBy(how = How.XPATH, using = "//*[@id=\"name\"]")
		@CacheLookup
		WebElement contactname;
		@FindBy(how = How.XPATH, using = "//*[@id=\"pincode\"]")
		@CacheLookup
		WebElement pincode;
		@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
		@CacheLookup
		WebElement city;
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_line_1\"]")
		@CacheLookup
		WebElement address;
		@FindBy(how = How.XPATH, using = "/html/body/section/div/div[2]/div[2]/div/div[2]/div/div/form/div[7]/div/button[1]")
		@CacheLookup
		WebElement adsave;
		@FindBy(how = How.XPATH, using = "/html/body/section/div/div[2]/div[1]/div[2]/div[4]/a/h4")
		@CacheLookup
		WebElement logout;
	
	public void editname(String uname) {
		txtname.sendKeys(uname);
	
	}
	
	public void editmail()
	{
		if(txtemail.isEnabled()==true)
		{
         System.out.println("Email field is editable");
     	}
	
	   else
		System.out.println("Email field is not editable");
        }
	
	public void editphone()
	{
		if(txtphone.isEnabled()==true)
		{
         System.out.println("phone number field is editable");
	    }
	
	else		System.out.println("phone number field is not editable");
     }	
		public void myorders()
		{
			myorders.click();
	
			if(ldriver.findElement(By.xpath("/html/body/section/div/div[1]/div/div[1]/div[1]/h1")).isDisplayed()==true)
			   {
				System.out.println("My Orders page is displayed");
			   }
			else
				System.out.println("My Orders page is not displayed");
		}	
		
		
		public void myaddressclk()
		{	
			WebElement wbmyaddress=ldriver.findElement(By.linkText("My Address "));
			//WebElement wbmyaddress=ldriver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div[2]/div[3]/a/h4"));
			wbmyaddress.click();
			myaddress.click();
     	}
				
		public void editaddressclk()
		{
			WebElement wbeditaddress=ldriver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/span[1]/a/i"));
			wbeditaddress.click();
			editaddress.click();
		}
				
		public void editaddress(String cname,String address1,String City1,String pincode1)
		{	contactname.sendKeys(cname);
			address.sendKeys(address1);
			city.sendKeys(City1);
			pincode.sendKeys(pincode1);
			adsave.click();
			
		}
		}
	