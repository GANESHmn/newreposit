
	
	package com.Laundry.PageObjects;

	

import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

	public class OrdersPage {

		WebDriver ldriver;
		
		public OrdersPage(WebDriver rdriver)
		
		{
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		@FindBy(how = How.CSS, using = "body > section > div > div.list-breadcums > div > div.col-md-6.col-sm-4.hidden-xs > ul > li:nth-child(2)")
		@CacheLookup
		WebElement Productlist;
		@FindBy(how = How.XPATH, using = "//*[@id=\"accordion\"]/div[1]/div")
		@CacheLookup
		WebElement Subcategorylist;
		@FindBy(how = How.XPATH, using = "//button[contains(@class, 'quantity-left-minus')]")
		@CacheLookup
		WebElement leftminus;
		@FindBy(how = How.XPATH, using = "//button[contains(@class, 'quantity-right-plus')]")
		@CacheLookup
		//public
		WebElement rightplus;
		@FindBy(how = How.XPATH, using = "//*[@id=\"collapse-2\"]/div/div/div/div/div/div/div/div[1]/ul/li[1]/div[2]/span[3]/button")
		@CacheLookup
		WebElement wrightplus;
		@FindBy(how = How.XPATH, using = "//*[@id=\"collapse-2\"]/div/div/div/div/div/div/div/div[1]/ul/li[1]/div[2]/span[1]")
		@CacheLookup
		WebElement wleftminus;
		@FindBy(how = How.XPATH, using = "//*[@id=\"collapse-3\"]/div/div/div/div/div/div/div/div[1]/ul/li[1]/div[2]/span[1]/button/span")
		@CacheLookup
		WebElement kleftminus;
		@FindBy(how = How.XPATH, using = "//*[@id=\"collapse-3\"]/div/div/div/div/div/div/div/div[1]/ul/li[1]/div[2]/span[3]/button")
		@CacheLookup
		WebElement krightplus;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"submit-btn\"]")
		@CacheLookup
		public
		WebElement btncontinue;
		@FindBy(how = How.XPATH, using = "//div[@class=\"price-header\"]")
		@CacheLookup
		WebElement pricedetails;
		@FindBy(how = How.XPATH, using = "//label[contains(text(),'Washed, Ironed And Folded')]")
		@CacheLookup
		public
		WebElement washed;
		@FindBy(how = How.XPATH, using = "//*[@id=\"min_order_amt_alert\"]")
		@CacheLookup
		WebElement minorderalert;
		@FindBy(how = How.CSS, using = "button[class='back-btn']")
		@CacheLookup
		WebElement btnback;
		@FindBy(how = How.CSS, using = "button[id='continue_to_pay_btn']")
		@CacheLookup
		public
		WebElement btncontinue_to_pay;
		
		
	}