package com.Yosi;


import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Athena.Athena_Base_Class;
import com.Athena.Read_Excel;
import com.Athena.RegistrationPage;

public class Regression extends Athena_Base_Class

{
	@Test(dataProvider = "inputdata")
	public void regression(String Lastname,String Firstname,String Sex,String Dob,String phone,String email,String Mstatus,String appt,String provider,String strt_time,String duration) throws IOException {
	
		Regression_Page rp=new Regression_Page(driver);
		rp.regression(Lastname,Firstname,Sex,Dob,phone,email,Mstatus);
		
	}
@DataProvider(name="inputdata")
String [][] getData() throws IOException
{
 
	String path=System.getProperty("user.dir")+"/Testdata.xlsx";
	
	int rowcount=Read_Excel.getRowCount(path,"Sheet1");
	int colcount=Read_Excel.getCellcount(path,"Sheet1",rowcount);
	
	String inputdata[][]=new String [rowcount][colcount];
	for(int i=1;i<=rowcount;i++){

		for(int j=0;j<colcount;j++)
		{
			inputdata[i-1][j]=Read_Excel.getCelldata(path,"Sheet1",i,j);
		}}
	
return inputdata;
}}