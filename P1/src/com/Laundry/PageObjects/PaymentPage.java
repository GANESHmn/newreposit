package com.Laundry.PageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


	public class PaymentPage {

		WebDriver ldriver;
		
		PaymentPage(WebDriver rdriver)
		
		{
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		
		@FindBy(how = How.XPATH, using = "//input[@name=\"cardCVC\"]")
		@CacheLookup
		WebElement savedcard;
		@FindBy(how = How.LINK_TEXT, using = "Copy")
		@CacheLookup
		WebElement copyoffer;
		@FindBy(how = How.XPATH, using = "//button[@id=\"applyCoupon\"]")
		@CacheLookup
		WebElement applycoupon;

		@FindBy(how = How.XPATH, using = "//button[@class=\"verify-btn\"]")
		@CacheLookup
		WebElement btnverify;

		@FindBy(how = How.XPATH, using = "//input[@name=\"cardNumber\"]")
		@CacheLookup
		WebElement cardnumber;
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[6]/form/div/div/div/div[2]/div[1]/div/div[2]/div[1]/input")
		@CacheLookup
		WebElement cardexpiry;

		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[6]/form/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div/input")
		@CacheLookup
		WebElement cardcvc;
		//@FindBy(how = How.CSS, using = "#pickup_address > div.delivery-btn > button.save-btn.continue-btn.hover-btn")
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[7]/button[2]")
		@CacheLookup                       
		WebElement paybtn;
		
		@FindBy(how = How.XPATH, using = "//button[class=\"back-btn hover-btn\"]")	
		@CacheLookup
		WebElement backbtn;
		@FindBy(how = How.XPATH, using = "//div[class=\"order-id\"]")	
		@CacheLookup
		WebElement orderid;
		@FindBy(how = How.XPATH, using = "/html/body/section/div[1]/div/div[1]/div/div[1]/p")	
		@CacheLookup
		WebElement ordermsg;
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[5]/span")	
		@CacheLookup
		WebElement paymenterror;
		@FindBy(how = How.XPATH, using = "//*[@id=\"pickup_address\"]/div[6]/form/div/div/div/div[2]/div[2]/div/span")	
		@CacheLookup
		WebElement invalid_card_error;
	
	public void payment1(String cardno)
	{
		cardnumber.sendKeys(cardno);
		btnverify.click();
		JavascriptExecutor je=(JavascriptExecutor)ldriver;
		je.executeScript("arguments[0].scrollIntoView(true);",paybtn);
		paybtn.click();
	}}
	