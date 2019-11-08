package com.Laundry.PageObjects;

	

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class AddressPage {

		WebDriver ldriver;
		
		public AddressPage(WebDriver rdriver)
		
		{
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"tests\"]")
		@CacheLookup
		WebElement addressbox;
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup-swipe-block\"]/div/div[2]/div/div[1]/ul/li[2]/span[1]/i")
	    @CacheLookup
		WebElement addressedit;
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[1]/div[2]/form/div/div[1]/div[1]/div[2]/select")
		@CacheLookup
		WebElement pickupaddress;
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[1]/div[1]/span/ul/li")
		@CacheLookup
		WebElement addaddress;
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_line_1\"]")
		@CacheLookup
		WebElement addressline1;
		@FindBy(how = How.XPATH, using = "//*[@id=\"address_line_2\"]")
		@CacheLookup
		WebElement addressline2;
		@FindBy(how = How.XPATH, using = "//*[@id=\"location\"]")
		@CacheLookup
		WebElement location;
		@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
		@CacheLookup
		WebElement city;
		@FindBy(how = How.XPATH, using = "//i[@class=\"fa fa-trash address-delete\"]")
		@CacheLookup
		WebElement addressdelete;
		@FindBy(how = How.CSS, using = "button[class='address-save hover-btn']")
		@CacheLookup
		WebElement btnsave;
		@FindBy(how = How.CSS, using = "button[class='address-cancel hover-btn']")
		@CacheLookup
		WebElement btncancel;
		
		
		//*[@id="pickup_address"]/div[3]/div[2]/div/div[1]/div/input
   	    //class name="bootstrap-datetimepicker-widget dropdown-menu usetwentyfour bottom"
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[3]/div[2]/div/div[1]/div/input")
		@CacheLookup                      //*[@id=\"pickup_address\"]/div[3]/div[2]/div/div[1]/div/div/ul/li[1]/div/div[1]/table/tbody/tr[3]/td[4]
		WebElement pickupdate;
		
		//@FindBy(how = How.CSS, using = "#pickup_address > div:nth-child(5) > div.row > div > div:nth-child(7) > div > select")
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[3]/div[2]/div/div[2]/div/select")
		@CacheLookup  
		WebElement pickuptime;
		
		
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[4]/div[2]/div/div[1]/div/input")
		@CacheLookup
		WebElement deliverydate;
		
		
		//@FindBy(how = How.CSS, using = "#pickup_address > div:nth-child(6) > div.row > div > div:nth-child(2) > div > select")
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[4]/div[2]/div/div[2]/div/select")
		@CacheLookup
		WebElement deliverytime;
		
		
		@FindBy(how = How.XPATH, using = "//input[@id=\"couponCode\"]")
		@CacheLookup
		WebElement couponcode;
		@FindBy(how = How.XPATH, using = "//div(contains[@class,'price-details amt-payable'])")
		@CacheLookup
		WebElement amountdetails;
        
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[3]/div[2]/div/div[1]/div/div/ul/li[1]/div/div[1]/table/tbody/tr[3]/td[4]")
		@CacheLookup  
		WebElement pdate;
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[4]/div[2]/div/div[1]/div/div/ul/li[1]/div/div[1]/table/tbody/tr[4]/td[4]")
		@CacheLookup
		WebElement ddate;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup-swipe-block\"]/div/div[1]/div/div[2]")
		@CacheLookup
		WebElement existaddress1;
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup-swipe-block\"]/div/div[1]/div")
		@CacheLookup
		WebElement existaddress2;
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[1]/div[1]/span/ul/li")
		@CacheLookup
		WebElement editAddnewadderss;
		
		
		
	public void addaddress(String add1,String add2,String loc,String cty) throws InterruptedException
	{
		addaddress.click();
		Thread.sleep(2000);
		addressline1.clear();
		addressline1.sendKeys(add1);
		Thread.sleep(1000);
		addressline2.click();
		addressline2.sendKeys(add2);
		Thread.sleep(1000);
		location.click();
		location.sendKeys(loc);
		Thread.sleep(1000);
		city.clear();
		city.sendKeys(cty);
		btnsave.click();
		}
	public void editaddress() throws InterruptedException
	{ 
		WebElement label=ldriver.findElement(By.xpath("//*[@id=\"tests\"]"));
		String nlabel =label.getText();
		System.out.print(nlabel);
		WebElement radio=ldriver.findElement(By.xpath("//*[@id=\"pickup-swipe-block\"]/div/div/div/div[1]/ul/li[1]"));
		Actions act=new Actions(ldriver);
		act.moveToElement(radio).build().perform();
		existaddress1.click();
		if(radio.isSelected()==true) 
		{
		    act.moveToElement(addressbox).build().perform();
		    act.moveToElement(addressedit).click().build().perform();
		    WebDriverWait wait=new WebDriverWait(ldriver,15);
		    wait.until(ExpectedConditions.visibilityOf(pickupaddress));
		    Select s = new Select(pickupaddress);
		    s.selectByIndex(3);
		    btnsave.click();			
		}		
		else 
		{
			addaddress.click();
			WebDriverWait wait=new WebDriverWait(ldriver,15);
			wait.until(ExpectedConditions.visibilityOf(pickupaddress));
			Select s = new Select(pickupaddress);
			s.selectByIndex(4);
			btnsave.click();
		}
		 
	}
	public void deleteaddress() throws InterruptedException
	{
		WebElement label=ldriver.findElement(By.xpath("//*[@id=\"tests\"]"));
		String nlabel =label.getText();
		System.out.print(nlabel);
		WebElement radio=ldriver.findElement(By.xpath("//*[@id=\"pickup-swipe-block\"]/div/div/div/div[1]/ul/li[1]"));
		Actions act=new Actions(ldriver);
		act.moveToElement(radio).build().perform();
		existaddress1.click();
		if(radio.isSelected()==true) 
		{
			    act.moveToElement(addressbox).build().perform();
			    act.moveToElement(addressedit).click().build().perform();
			    WebDriverWait wait=new WebDriverWait(ldriver,15);
			    wait.until(ExpectedConditions.visibilityOf(pickupaddress));
			    Select s = new Select(pickupaddress);
			    s.selectByIndex(3);
			    btnsave.click();			
			}		
			else 
			{			
				addaddress.click();
				WebDriverWait wait=new WebDriverWait(ldriver,15);
				wait.until(ExpectedConditions.visibilityOf(pickupaddress));
				Select s = new Select(pickupaddress);
				s.selectByIndex(4);
				btnsave.click();
		        Thread.sleep(4000);
		        act.moveToElement(addressbox).build().perform();
				act.moveToElement(addressdelete).click().build().perform();
				System.out.println("Address deleted Successfully");
				}
}
	public void setpickupdate() throws InterruptedException 
	{
        pickupdate.click();
		Actions act=new Actions(ldriver);
		act.moveToElement(pdate).click().build().perform();
		Thread.sleep(3000);
		ldriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebElement ppdate=ldriver.findElement(By.xpath("//*[@id=\"pickup_address\"]/div[3]/div[2]/div/div[1]/div/input"));
		ldriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		ppdate.sendKeys("2019-09-05");
		pickuptime.click();
	    Select s=new Select(pickuptime);
	    Thread.sleep(3000); 
	    s.selectByIndex(1);
	    }
	public void setdeliverydate() throws InterruptedException
	{
		deliverydate.click();
		Actions act=new Actions(ldriver);
		act.moveToElement(ddate).click().build().perform();
		WebElement ppdate=ldriver.findElement(By.xpath("//*[@id=\"pickup_address\"]/div[4]/div[2]/div/div[1]/div/input"));
		ppdate.sendKeys("2019-09-19");
	//	ldriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
	    Select s=new Select(deliverytime);
	    Thread.sleep(3000);
	    s.selectByIndex(0);
	}
	}