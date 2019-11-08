package com.Laundry.PageObjects;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class MyOrdersPage {

		WebDriver ldriver;
		
		MyOrdersPage(WebDriver rdriver)
		
		{
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		
		
		@FindBy(how = How.LINK_TEXT, using = "View Order")
		@CacheLookup
		WebElement vieworder;
		@FindBy(how = How.XPATH, using = "/html/body/section/div/div[1]/div/div[2]/div[1]/div/div/div[2]/ul/li[2]/a")
		@CacheLookup
		WebElement trackorder;
		@FindBy(how = How.XPATH, using = "//div[@class=\"modal-header\"]")
		WebElement orderdetails;
		@FindBy(how = How.XPATH, using = "/html/body/section/div[1]/div[1]/div/span/a")
		WebElement backtoorders;
		@FindBy(how = How.XPATH, using = "//button[@class=\"close\"]")
		WebElement close;
	
	public void ViewOrder()
	{
		vieworder.click();
		if(backtoorders.isDisplayed()==true)
		{
			System.out.println("Orders are able to viewed");
	
		}}
		public void TrackOrder()
		{
			trackorder.click();
			WebDriverWait wait=new WebDriverWait(ldriver,10);
			wait.until(ExpectedConditions.visibilityOf(orderdetails));
			if(orderdetails.isDisplayed()==true)
			{
				System.out.println("Order details displayed");
				close.click();
            
		}}
			public void BacktoOrder()
			{
				backtoorders.click();
				if(ldriver.findElement(By.xpath("/html/body/section/div/div[1]/div/div[1]/div[1]/h1")).isDisplayed()==true)
				{
					System.out.println("My Orders page is displayed");
				}
				else
					System.out.println("My Orders page is not displayed");
			}	
				
			
			
	}