package com.Yosi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ROS_Page extends Yosi_Base_Class {
	
	WebDriver ldriver;
	
	public ROS_Page	(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

	
	
@FindBy(how = How.XPATH, using = "//*[@id=\"form_mdynamicqadone\"]/div/div/div[3]/div/div[1]/label")
@CacheLookup
WebElement fever_yes;

@FindBy(how = How.XPATH, using = "//*[@id=\"form_mdynamicqadone\"]/div/div/div[4]/div/div[2]/label")
@CacheLookup
WebElement night_sweat;
@FindBy(how = How.XPATH, using = "//*[@id=\"form_mdynamicqadone\"]/div/div/div[5]/div/div[1]/label")
@CacheLookup
WebElement weight_gain;
@FindBy(how = How.XPATH, using = "//*[@id=\"form_mdynamicqadone\"]/div/div/div[6]/div/div[1]/label")
@CacheLookup
WebElement weight_loss;
@FindBy(id="answer_1660_0")
@CacheLookup
WebElement exercise;
@FindBy(id="answer_1661_0")
@CacheLookup
WebElement eyes;
@FindBy(id="answer_1662_1")
@CacheLookup
WebElement irritation;
@FindBy(id="answer_1663_1")
@CacheLookup
WebElement vision;
@FindBy(id="answer_1664_0")
@CacheLookup
WebElement hearing;
@FindBy(id="answer_1665_1")
@CacheLookup
WebElement ear;
@FindBy(name="Review_of_Systems")
@CacheLookup
WebElement next;
@FindBy(how = How.XPATH, using = "//*[@id=\"dynamic-qa_html\"]/div[1]/div/div/p")
@CacheLookup
WebElement title;

public void set_ROS_Page()
{
	WebDriverWait wait=new WebDriverWait(driver,15);
	wait.until(ExpectedConditions.visibilityOf(title));
	
	wait.until(ExpectedConditions.elementToBeClickable(fever_yes));
	fever_yes.click();
night_sweat.click();
	weight_gain.click();
	weight_loss.click();
	next.click();
}

}